package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.managers;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.dataproviders.ConfigFileReader;

/**
 * Created by SK00447696 on 4/12/18.
 */
public class FileReaderManager {

    private static FileReaderManager fileReaderManager = new FileReaderManager();
    private static ConfigFileReader configFileReader;

    private FileReaderManager() {
    }

    public static FileReaderManager getInstance( ) {
        return fileReaderManager;
    }

    public ConfigFileReader getConfigReader() {
        return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
    }
}