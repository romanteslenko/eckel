package com.teslenko.innerclasses;

class First {
    protected int i;
    First(int i) {
        this.i = i;
    }
    void printI() {
        System.out.println("Original i = " + i);
    }
}

class Second {
    First createA(int i) {
        return new First(i) {
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
        First orig = new First(10);
        orig.printI();
        First anonym = new Second().createA(10);
        anonym.printI();
    }
}
