package org.test.java8.interfaces.diamond;

public class DiamondProblemTest {

    private interface O {
        void foo();
    }

    private interface A extends O {
        default void foo() {
            System.out.println(1);
        }
    }

    private interface B extends O {
        default void foo() {
            System.out.println(2);
        }
    }

    private static class X implements A, B {

        public void foo() {
            A.super.foo();
        }
    }

    public static void main(String[] args) {
        var x = new X();
        System.out.println(x);
    }
}
