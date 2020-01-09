package org.test.java11.var;

import java.util.function.Consumer;

public class TypeDeduceForLambda {

    public @interface TestAnnotation {

    }

    @FunctionalInterface
    public interface TestConsumer<T> {

        void accept(@TestAnnotation T x);
    }

    public static void main(String[] args) {

        Consumer<String> c = (var x) -> {
            System.out.println(x);
        };

        TestConsumer<String> z = (var x) -> {
            System.out.println(x);
        };

        // NOT possible with annotations
        TestConsumer<String> z1 = (@TestAnnotation var x) -> {
            System.out.println(x);
        };
    }
}
