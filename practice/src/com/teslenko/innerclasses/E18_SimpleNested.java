package com.teslenko.innerclasses;

public class E18_SimpleNested {
    private static class Nested {}

    public static void main(String[] args) {
        Nested nested = new Nested();
        //E18_SimpleNested.Nested nested = new E18_SimpleNested.Nested();
    }
}
