package org.test.java8.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorTest {

    public static void main(String[] args) {
        ArrayList<Integer> result = Stream.of(1, 2, 3, 4, 5, 6, 7).collect(Collectors.toCollection(ArrayList::new));

        System.out.println(result);
    }
}
