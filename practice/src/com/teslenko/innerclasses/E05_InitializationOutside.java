package com.teslenko.innerclasses;

public class E05_InitializationOutside {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }
}
