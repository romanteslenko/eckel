package com.teslenko.operators;

public class E15_CompareStrings {
    static void compare(String lhs, String rhs) {
        System.out.println(lhs + ".equals(" + rhs + ") : " + lhs.equals(rhs));
        System.out.println(lhs + " == " + rhs + " : " + (lhs == rhs));
        System.out.println(lhs + " != " + rhs + " : " + (lhs != rhs));
        System.out.println();
    }

    public static void main(String[] args) {
        compare("Hello", "World");
        String str = new String("java");
        compare("java", str);
        compare("Test", "Test");
    }
}
