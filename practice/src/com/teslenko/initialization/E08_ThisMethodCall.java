package com.teslenko.initialization;

public class E08_ThisMethodCall {
    void f1() {
        System.out.println("f1");
    }

    void f2() {
        System.out.println("f2");
        this.f1();
        f1();
    }

    public static void main(String[] args) {
        E08_ThisMethodCall test = new E08_ThisMethodCall();
        test.f2();
    }
}
