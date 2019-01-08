package com.teslenko.interfaces;

abstract class PureAbstract {
    void test() {
        System.out.println("Hello from pure abstract class");
    }
}

public class E02_Abstact {
    public static void main(String[] args) {
        //PureAbstract instance = new PureAbstract();  // abstract classes cannot be instantiated
    }
}
