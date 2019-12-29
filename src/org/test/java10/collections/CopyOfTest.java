package org.test.java10.collections;

import java.util.*;

public class CopyOfTest {

    public static void main(String[] args) {

        List<String> copy = List.copyOf(Arrays.asList("1", "2", "3"));

        System.out.println(copy);

        Set<String> setCopy = Set.copyOf(Set.of("a", "b", "c"));

        System.out.println(setCopy);

        var mapCopy = Map.copyOf(Map.of("a", 2, "b", 5));
        System.out.println(mapCopy);
    }
}
