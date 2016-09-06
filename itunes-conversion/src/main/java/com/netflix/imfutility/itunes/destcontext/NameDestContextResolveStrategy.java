/*
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
package com.netflix.imfutility.itunes.destcontext;

import com.netflix.imfutility.ConversionException;
import com.netflix.imfutility.itunes.ITunesPackageType;
import com.netflix.imfutility.itunes.destcontext.filter.DestContextPackageTypeFilter;
import com.netflix.imfutility.xsd.conversion.DestContextTypeMap;
import com.netflix.imfutility.xsd.conversion.DestContextsTypeMap;

import java.util.Map.Entry;
import java.util.Objects;

/**
 * Resolve dest context by name.
 */
public class NameDestContextResolveStrategy implements DestContextResolveStrategy {
    private final String name;
    private final ITunesPackageType packageType;

    public NameDestContextResolveStrategy(String name, ITunesPackageType packageType) {
        this.name = name;
        this.packageType = packageType;
    }

    @Override
    public DestContextTypeMap resolveContext(DestContextsTypeMap destContexts) throws ConversionException {
        return destContexts.getMap().entrySet().stream()
                .filter(entry -> Objects.equals(entry.getKey(), name))
                .findFirst()
                .map(Entry::getValue)
                .filter(new DestContextPackageTypeFilter(packageType))
                .orElseThrow(() -> new ConversionException(String.format(
                        "Format %s can't be defined for %s package type.", name, packageType)));
    }
}
