package com.teslenko;

class A {
    class B {
    }
}

class C extends A.B {
    C(A a) {
        a.super();
    }
}


public class Main {
    public static void main(String[] args) {
        A.B b = new A().new B();

    }
}
