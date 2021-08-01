package org.test.newfeatures;

public class PatternMatchingSwitch {

    public enum TestEnum {
        A,
        B,
        C
    }

    public static void main(String[] args) {
        TestEnum val = TestEnum.A;

        String res = switch(val) {
            case A -> "A";
            case B -> "BB";
            case C -> "CC";
        };

        System.out.println(res);
    }
}
