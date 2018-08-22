package com.teslenko.initialization;

public class E02_StringInit {
    private String initByDefinition = "Hello ";
    private String initByConstructor;

    E02_StringInit(String str) {
        initByConstructor = str;
    }

    @Override
    public String toString() {
        return initByDefinition + initByConstructor;
    }

    public static void main(String[] args) {
        E02_StringInit example = new E02_StringInit("World");
        System.out.println(example);
    }
}
