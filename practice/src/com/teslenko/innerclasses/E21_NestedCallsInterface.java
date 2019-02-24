package com.teslenko.innerclasses;

interface ITest2 {
    int i = 77;
    void f();
    class Inner {
        void displayF(ITest2 testInstance) {
            testInstance.f();
        }
    }
}

class TestImpl implements ITest2 {
    @Override
    public void f() {
        System.out.println("i = " + i);
    }
}

public class E21_NestedCallsInterface {
    public static void main(String[] args) {
        new ITest2.Inner().displayF(new TestImpl());
    }
}
