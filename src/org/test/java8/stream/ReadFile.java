package org.test.java8.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        Stream<String> lines = Files.lines(Paths.get("java-features.iml"));

        lines.forEach(System.out::println);

        lines.close();
    }
}
