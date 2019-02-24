package com.teslenko.innerclasses;

class Outer11 {
    private int i = 77;
    private void printI() {
        System.out.println("Outer11.i = " + i);
    }
    void testAnonymous() {
        new Object() {
            void f() {
                Outer11.this.i = 99;
                printI();
            }
        }.f();
    }
}


public class E12_AnonymousControlsOuter {
    public static void main(String[] args) {
        new Outer11().testAnonymous();
    }
}
