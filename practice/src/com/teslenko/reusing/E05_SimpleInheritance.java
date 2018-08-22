package com.teslenko.reusing;

class A {
    A() {
        System.out.println("A");
    }
}

class B {
    B() {
        System.out.println("B");
    }
}

class C extends A {
    private B b = new B();
}

public class E05_SimpleInheritance {
    public static void main(String[] args) {
        new C();
    }
}
