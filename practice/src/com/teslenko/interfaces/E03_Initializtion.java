package com.teslenko.interfaces;

abstract class AbstractPrint {
    AbstractPrint() {
        print();
    }

    abstract void print();
}

class DerivedPrint extends AbstractPrint {
    private int i = 77;

    @Override
    void print() {
        System.out.println(i);
    }
}

public class E03_Initializtion {
    public static void main(String[] args) {
        AbstractPrint ap = new DerivedPrint();
        ap.print();
    }
}

