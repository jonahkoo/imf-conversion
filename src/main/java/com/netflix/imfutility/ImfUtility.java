package com.netflix.imfutility;

import com.netflix.imfutility.dpp.DppFormatBuilder;
import com.netflix.imfutility.dpp.inputparameters.DppInputParameters;
import com.netflix.imfutility.dpp.inputparameters.DppInputParametersBuilder;

/**
 * The main class.
 * <ul>
 * <li>Invokes command line parsing logic</li>
 * <li>Invokes an appropriate builder depending on the inout format and mode</li>
 * </ul>
 */
public class ImfUtility {

    public static void main(String... args) {
        //TODO: add command line parameter processing logic
        DppInputParameters inputParameters = new DppInputParametersBuilder()
                .setConfigXml(ClassLoader.getSystemClassLoader().getResource("test/config.xml").getPath())
                .setImpDirectory("G:\\Netflix\\content\\TEST\\Chimera23_FTR_C_EN_XG-NR_20_4K_20150603_OV\\Chimera23_FTR_C_EN_XG-NR_20_4K_20150603_OV")
                .setCplXml("CPL-test.xml")
                .setDeleteTmpFilesOnExit(false)
                .setDeleteTmpFilesOnExit(false)
                .setMetadataXml(ClassLoader.getSystemClassLoader().getResource("test/metadata.xml").getPath())
                .build();

        int exitCode = new DppFormatBuilder(inputParameters).build();
        System.exit(exitCode);
    }

}
