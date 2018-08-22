package com.teslenko.initialization;

class Test {
    static String hello = "hello";
    static String world;

    static {
        world = "world";
    }

    static void print() {
        System.out.println("hello=" + hello + " world=" + world);
    }
}

public class E14_StaticInitialization {
    public static void main(String[] args) {
        Test.print();
    }
}
