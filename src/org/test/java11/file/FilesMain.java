package org.test.java11.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMain {

    public static void main(String[] args) throws IOException {
        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This was posted on JD");
        System.out.println(path);
        String s = Files.readString(path);
        System.out.println(s);
    }
}
