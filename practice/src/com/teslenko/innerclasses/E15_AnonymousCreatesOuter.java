package com.teslenko.innerclasses;

class A {
    protected int i;
    A(int i) {
        this.i = i;
    }
    void printI() {
        System.out.println("Original i = " + i);
    }
}

class B {
    A createA(int i) {
        return new A(i) {
            {
                this.i *= 2;
            }
            @Override
            void printI() {
                System.out.println("Anonymous i = " + i);
            }
        };
    }
}

public class E15_AnonymousCreatesOuter {
    public static void main(String[] args) {
        A orig = new A(10);
        orig.printI();
        A anonym = new B().createA(10);
        anonym.printI();
    }
}
