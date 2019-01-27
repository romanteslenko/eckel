package com.teslenko.interfaces;

interface A {
    void f();
}

interface B extends A {
    @Override
    void f();
}

interface C extends A {
    @Override
    void f();
}

interface D extends C, B {
    @Override
    void f();
}

public class E13_Diamond implements D {
    @Override
    public void f() {
        System.out.println("f()");
    }

    public static void main(String[] args) {
        new E13_Diamond().f();
    }
}
