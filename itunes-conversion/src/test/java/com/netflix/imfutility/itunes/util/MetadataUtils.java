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
package com.netflix.imfutility.itunes.util;

import java.io.File;
import java.net.URISyntaxException;

/**
 * Test utility for metadata.xml.
 */
public class MetadataUtils {

    private MetadataUtils() {
    }

    public static File getCorrectMetadataXml() throws URISyntaxException {
        return new File(ClassLoader.getSystemClassLoader().getResource("xml/metadata/test-metadata.xml").toURI());
    }

    public static File getCorrectMultipleLocaleMetadataXml() throws URISyntaxException {
        return new File(ClassLoader.getSystemClassLoader().getResource("xml/metadata/test-metadata-multiple-locale.xml").toURI());
    }

    public static File getCorrectConcertMetadataXml() throws URISyntaxException {
        return new File(ClassLoader.getSystemClassLoader().getResource("xml/metadata/test-metadata-concert.xml").toURI());
    }

    public static File getCorrectIntervalsMetadataXml() throws URISyntaxException {
        return new File(ClassLoader.getSystemClassLoader().getResource("xml/metadata/test-metadata-intervals.xml").toURI());
    }

    public static File getInvalidMetadataXml() throws URISyntaxException {
        return new File(ClassLoader.getSystemClassLoader().getResource("xml/metadata/invalid/invalid-test-metadata.xml").toURI());
    }

    public static File getBrokenMetadataXml() throws URISyntaxException {
        return new File(ClassLoader.getSystemClassLoader().getResource("xml/metadata/broken/broken-test-metadata.xml").toURI());
    }
}
