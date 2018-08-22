package com.teslenko.reusing;

class BasePrinter {
    void print() {
        System.out.println("empty line");
    }

    void print(char ch) {
        System.out.println("char = " + ch);
    }

    void print(int i) {
        System.out.println("integer = " + i);
    }
}

class ExtendedPrinter extends BasePrinter {
    void print(String str) {
        System.out.println("String = " + str);
    }
}

public class E13_Overloading {
    public static void main(String[] args) {
        BasePrinter bp = new BasePrinter();
        bp.print();
        bp.print(5);
        bp.print('w');
        ExtendedPrinter ep = new ExtendedPrinter();
        ep.print("test");
    }
}
