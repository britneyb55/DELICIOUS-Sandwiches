package com.pluralsight.services;

import com.pluralsight.models.Sandwich;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SandwichFileManager
{
    private final String LOG_DIRECTORY_PATH = "files";
    private String filePath;

    public SandwichFileManager(String fileName) {
        // this makes sure that the logs folder is created
        File directory = new File(LOG_DIRECTORY_PATH);
        if (!directory.exists()) {
            directory.mkdir();
        }

        // create a variable with the correct file path
//        this.fileName = fileName;
        this.filePath = LOG_DIRECTORY_PATH + "/" + fileName;
        if (!this.filePath.toLowerCase().endsWith(".csv")) {
            this.filePath += ".csv";
        }

    }

}
