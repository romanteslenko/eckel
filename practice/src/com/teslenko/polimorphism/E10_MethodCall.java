package com.teslenko.polimorphism;

class A {
    void f1() {
        f2();
    }

    void f2() {
        System.out.println("A test");
    }
}

class B extends A {
    @Override
    void f2() {
        System.out.println("B test");
    }
}

public class E10_MethodCall {
    public static void main(String[] args) {
        A a = new B();
        a.f1();
    }
}
