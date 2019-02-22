package com.teslenko.innerclasses;

class Outer {
    class Inner {}
    Inner inner() {
        return new Inner();
    }
}

public class E01_InnerInitialization {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().inner();
    }
}
