package org.test.java8.stream;

import java.util.stream.Stream;

public class StreamBuilder {

    public static void main(String[] args) {
        Stream.builder().add("a").add("b").add("c").build()
                .forEach(System.out::println);
    }
}
