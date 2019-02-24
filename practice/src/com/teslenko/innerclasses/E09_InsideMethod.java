package com.teslenko.innerclasses;

interface IInner {
    void f();
}

class Outer6 {
    IInner getInner() {
        class Inner implements IInner {
            @Override
            public void f() {
                System.out.println("Inner.f()");
            }
        }
        return new Inner();
    }
}

public class E09_InsideMethod {
    public static void main(String[] args) {
        new Outer6().getInner().f();
    }
}
