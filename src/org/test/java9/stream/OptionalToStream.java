package org.test.java9.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalToStream {

    public static void main(String[] args) {

        Stream.concat(Optional.of(1).stream(), Optional.of(2).stream())
                .forEach(System.out::println);
    }
}
