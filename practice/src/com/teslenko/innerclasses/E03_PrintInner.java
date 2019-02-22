package com.teslenko.innerclasses;

class Outer2 {
    private String str;

    Outer2(String str) {
        this.str = str;
    }

    class Inner {
        @Override
        public String toString() {
            return str;
        }
    }

    Inner inner() {
        return new Inner();
    }
}

public class E03_PrintInner {
    public static void main(String[] args) {
        System.out.println(new Outer2("Hello World").inner());
    }
}
