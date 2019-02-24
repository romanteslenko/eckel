package com.teslenko.innerclasses;

interface ITest {
    void f();

    class Inner {
        void test() {
            System.out.println("test inside Inner");
        }
    }
}

public class E20_NestedInsideInterface implements ITest {
    @Override
    public void f() {
        System.out.println("f();");
    }

    public static void main(String[] args) {
        new E20_NestedInsideInterface().f();
        ITest.Inner inner = new ITest.Inner();
        inner.test();
    }
}
