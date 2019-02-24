package com.teslenko.innerclasses;

class Outer8 {
    private class Inner implements IInner {
        @Override
        public void f() {
            System.out.println("Inner.f(): private implementation");
        }
    }
    IInner getIInner() {
        return new Inner();
    }
    Inner getInner() {
        return new Inner();
    }
}

public class E11_InnerCasting {
    public static void main(String[] args) {
        Outer8 outer = new Outer8();
        IInner iinner = outer.getIInner();
        iinner.f();
        //((Inner)iinner).f();
        //Inner inner = new outer.getInner();
    }
}
