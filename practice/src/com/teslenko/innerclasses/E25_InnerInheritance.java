package com.teslenko.innerclasses;

class Outer14 {
    class Inner {
        private String msg;
        Inner(String string) {
            msg = string;
        }
        void test() {
            System.out.println("inner message = " + msg);
        }
    }
}

class InheritedInner extends Outer14.Inner {
    InheritedInner(Outer14 outer) {
        outer.super("hello world");
    }
}

public class E25_InnerInheritance {
    public static void main(String[] args) {
        Outer14 outer = new Outer14();
        InheritedInner ii = new InheritedInner(outer);
        ii.test();
    }
}
