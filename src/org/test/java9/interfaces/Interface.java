package org.test.java9.interfaces;

public interface Interface {

    default void aaz() {
        foo();
    }

    private void foo() {
        System.out.println("a");
    }
}

class Impl implements Interface {

}