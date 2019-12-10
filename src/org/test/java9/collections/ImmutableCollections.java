package org.test.java9.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollections {

    public static void main(String[] args) {
        List<String> testList = List.of("A", "B", "C");

        testList.add("zx");

        Set<String> testSet = Set.of("A", "B", "C");

        Map<String, Integer> testMap = Map.of("A", 2, "C", 5);
    }
}
