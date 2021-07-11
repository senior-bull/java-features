package org.test.newfeatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMismatch {

    public static void main(String[] args) throws IOException {
        Path file1 = Files.createTempFile("a", "b");
        Path file2 = Files.createTempFile("a", "b");

        Files.writeString(file1, "abcdef");
        Files.writeString(file2, "abxdef");

        // 2
        System.out.println(Files.mismatch(file1, file2));
    }
}
