package org.test.java9.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IterateWithPredicate {

    public static void main(String[] args) {
        IntStream.iterate(1, i -> i < 5, i -> i + 1).forEach(System.out::println);

        Stream.iterate("a", str -> str.length() < 5, s -> s + "b").forEach(System.out::println);
    }
}
