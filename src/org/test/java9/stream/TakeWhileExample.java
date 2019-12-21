package org.test.java9.stream;

import java.util.stream.IntStream;

public class TakeWhileExample {

    public static void main(String[] args) {

        IntStream.of(5, 2, 2, 2, 6, 4, 4)
                .takeWhile(x -> x < 6)
                .forEach(System.out::println);
    }
}
