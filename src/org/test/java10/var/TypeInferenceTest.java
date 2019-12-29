package org.test.java10.var;

import java.util.List;

public class TypeInferenceTest {

    public static void main(String[] args) {
        var x = "asb";
        System.out.println(x);

        var z = List.of(1, 2, 3);
        System.out.println(z);
    }
}
