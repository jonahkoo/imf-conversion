/**
 * Copyright (C) 2016 Netflix, Inc.
 *
 *     This file is part of IMF Conversion Utility.
 *
 *     IMF Conversion Utility is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     IMF Conversion Utility is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with IMF Conversion Utility.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.netflix.imfutility.conversion.executor;

import com.netflix.imfutility.conversion.templateParameter.ContextInfo;
import com.netflix.imfutility.conversion.templateParameter.TemplateParameterResolver;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Conversion Operation parser. Splits arguments and resolves all parameters.
 */
public class ConversionOperationParser {

    private static final String QUOTES_TEMPLATE = "(\".*\")|('.*')";

    private final TemplateParameterResolver parameterResolver;

    public ConversionOperationParser(TemplateParameterResolver parameterResolver) {
        this.parameterResolver = parameterResolver;
    }

    /**
     * Resolves all parameters in the given conversion operation string, and splits arguments.
     * It doesn't add any quotes, so it's assumed that all quotes are added at the conversion.xml level.
     * If quotes should be be auto-added, then use {@link #parseWithQuotes(String, ContextInfo)}.
     * Moreover, the method removes leading and tailing quotes.
     *
     * @param conversionOperation a conversion operation string as defined in conversion.xml.
     * @param contextInfo         a context info to resolve template parameters.
     * @return process and arguments for the input conversion operation. The first element is the process, the other
     * elements are the arguments for the process.
     */
    public List<String> parseOperation(String conversionOperation, ContextInfo contextInfo) {
        // 1. resolve parameters BEFORE splitting since resolved values may contain multiple sub-parameters!
        conversionOperation = parameterResolver.resolveTemplateParameter(conversionOperation, contextInfo);

        // 2. split params and remove leading and tailing quotes
        // do not add quotes! it's up to conversion.xml to insert correct quotes.
        return splitParameters(conversionOperation).stream()
                .map(this::removeQuotes)
                .collect(Collectors.toList());
    }

    /**
     * Resolves all parameters in the given conversion operation string, and splits arguments.
     * <p>
     * Unlike {@link #parseOperation(String, ContextInfo)}, it adds quotes where needed.
     * </p>
     *
     * @param conversionOperation a conversion operation string as defined in conversion.xml.
     * @param contextInfo         a context info to resolve template parameters.
     * @return process and arguments for the input conversion operation. The first element is the process,
     * the other elements are the arguments for the process.
     */
    public List<String> parseWithQuotes(String conversionOperation, ContextInfo contextInfo) {
        // 1. resolve parameters BEFORE splitting since resolved values may contain multiple sub-parameters!
        conversionOperation = parameterResolver.resolveTemplateParameter(conversionOperation, contextInfo);

        // 2. split params and add quotes if needed
        return splitParameters(conversionOperation).stream()
                .map(this::addQuotes)
                .collect(Collectors.toList());
    }


    private List<String> splitParameters(String conversionOperation) {
        String trimmedConversionOperation = conversionOperation.trim();

        ParseState state = ParseState.NORMAL;

        StringTokenizer tokenizer = new StringTokenizer(trimmedConversionOperation, "\"\' \r\n", true);
        List<String> result = new ArrayList<>();
        StringBuilder currentArg = new StringBuilder();
        boolean lastTokenQuoted = false;

        while (tokenizer.hasMoreTokens()) {
            String nextToken = tokenizer.nextToken();
            switch (state) {
                case IN_QUOTE:
                    currentArg.append(nextToken);
                    if ("\'".equals(nextToken)) {
                        lastTokenQuoted = true;
                        state = ParseState.NORMAL;
                    }
                    break;
                case IN_DOUBLE_QUOTE:
                    currentArg.append(nextToken);
                    if ("\"".equals(nextToken)) {
                        lastTokenQuoted = true;
                        state = ParseState.NORMAL;
                    }
                    break;
                default:
                    if ("\'".equals(nextToken)) {
                        state = ParseState.IN_QUOTE;
                        currentArg.append(nextToken);
                    } else if ("\"".equals(nextToken)) {
                        state = ParseState.IN_DOUBLE_QUOTE;
                        currentArg.append(nextToken);
                    } else if (" ".equals(nextToken) || "\n".equals(nextToken) || "\r".equals(nextToken)) {
                        if (lastTokenQuoted || currentArg.length() != 0) {
                            result.add(currentArg.toString());
                            currentArg = new StringBuilder();
                        }
                    } else {
                        currentArg.append(nextToken);
                    }
                    lastTokenQuoted = false;
                    break;
            }
        }

        if (lastTokenQuoted || currentArg.length() != 0) {
            result.add(currentArg.toString());
        }

        if (state == ParseState.IN_QUOTE || state == ParseState.IN_DOUBLE_QUOTE) {
            throw new IllegalArgumentException(
                    String.format("Can not parse Conversion Operation '%s'. Unbalanced quotes.",
                            conversionOperation));
        }

        return result;
    }

    private String removeQuotes(String param) {
        Pattern p = Pattern.compile(QUOTES_TEMPLATE, Pattern.DOTALL);
        if (p.matcher(param).matches()) {
            return param.substring(1, param.length() - 1);
        }
        return param;
    }

    private String addQuotes(String param) {
        if (!param.contains(" ") && !param.contains("\n") && !param.contains("\r")) {
            return param;
        }
        if (!param.contains("=")) {
            return addQuotesIfNeeded(param);
        }
        String subParam = StringUtils.substringAfter(param, "=");
        String quotedSubParam = addQuotesIfNeeded(subParam);
        return StringUtils.substringBefore(param, "=") + "=" + quotedSubParam;
    }

    private String addQuotesIfNeeded(String param) {
        String trimmedParam = param.trim();
        Pattern p = Pattern.compile(QUOTES_TEMPLATE, Pattern.DOTALL);
        if (!p.matcher(trimmedParam).matches()) {
            if (trimmedParam.contains("\"")) {
                trimmedParam = String.format("'%s'", trimmedParam);
            } else {
                trimmedParam = String.format("\"%s\"", trimmedParam);
            }
        }
        return trimmedParam;
    }

    private enum ParseState {
        NORMAL, IN_QUOTE, IN_DOUBLE_QUOTE
    }
}
