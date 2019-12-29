package org.test.java10.collections;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToUnmodifiableTest {

/*
    public static <T> Collector<T, ?, List<T>> toUnmodifiableList() {
        return new Collectors.CollectorImpl<>((Supplier<List<T>>) ArrayList::new, List::add,
                (left, right) -> { left.addAll(right); return left; },
                list -> (List<T>)List.of(list.toArray()),
                CH_NOID);
    }
*/

    public static void main(String[] args) {

        List<String> unmodifiableList = Stream.of("12", "2", "3", "4", "56", "3")
                .filter(str -> str.length() == 1)
                .collect(Collectors.toUnmodifiableList());

        unmodifiableList.add("z");
    }
}
