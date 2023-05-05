package org.example;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("/Users/j_mac/SOLVD.LABA/StringUtilsFileUtils/src/main/resources/sample.txt");
        List<String> lines = FileUtils.readLines(inputFile, "UTF-8");

        Set<String> uniqueWords = new HashSet<>();
        for (String line : lines) {
            String[] words = StringUtils.split(line);
            for (String word : words) {
                if (!StringUtils.isBlank(word)) {
                    uniqueWords.add(word.toLowerCase());
                }
            }
        }
        File outputFile = new File("output.txt");
        FileUtils.writeStringToFile(outputFile, String.valueOf(uniqueWords.size()), "UTF-8");

        System.out.println("Number of unique words: " + uniqueWords.size());
    }
}
