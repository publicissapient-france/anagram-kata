package fr.xebia.katas.anagram;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.IOUtils;

public class WordFileLoader {

    public static List<String> loadFileLines(String filename){
        InputStream fileInputStream = ClassLoader.getSystemResourceAsStream(filename);
        try {
            return IOUtils.readLines(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException("Cannot read lines in file with name '" 
                    + filename + "'. Cause: " + e.getMessage(), e);
        }
    }
}
