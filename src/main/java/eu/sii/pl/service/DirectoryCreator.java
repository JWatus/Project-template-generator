package eu.sii.pl.service;

import java.io.File;

public class DirectoryCreator {
    public static void createDirectory(String path) {
        File dir = new File(path);
        if (!dir.exists())
            dir.mkdir();
    }
}