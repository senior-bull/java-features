package org.test.java11.string;

import java.util.stream.Collectors;

public class StringMethods {

    public static void main(String[] args) {
        System.out.println("asdasdsa\nzxczxczc\nascsad".lines().collect(Collectors.joining()));
    }
}
