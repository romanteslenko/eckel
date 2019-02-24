package com.teslenko.innerclasses;

class Outer7 {
    IInner getInner() {
        IInner inner = null;
        if (true) {
            class Inner implements IInner {
                @Override
                public void f() {
                    System.out.println("Inner.f(): created inside of some scope");
                }
            }
            inner = new Inner();
        }
        return inner;
    }
}

public class E10_InsideSomeScope {
    public static void main(String[] args) {
        new Outer7().getInner().f();
    }
}
