package com.teslenko.innerclasses;

class Outer9 {
    IInner getAnonymousInner() {
        return new IInner() {
            @Override
            public void f() {
                System.out.println("IInner.f(): anonymous");
            }
        };
    }
}

public class E13_AnonymousInsideMethod {
    public static void main(String[] args) {
        new Outer9().getAnonymousInner().f();
    }
}
