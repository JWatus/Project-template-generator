package eu.sii.pl.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ClassFileCreator {
    public static void writeClassToFile(String classTemplate, File file) throws IOException {
        if (!file.exists()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(classTemplate);
            }
        }
    }
}