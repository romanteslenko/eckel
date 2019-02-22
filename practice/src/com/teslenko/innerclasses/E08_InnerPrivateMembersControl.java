package com.teslenko.innerclasses;

class Outer5 {
    private class Inner {
        private int i = 88;
    }
    void testPrivateInnerField() {
        System.out.println("Inner.i = " + new Inner().i);
    }
}

public class E08_InnerPrivateMembersControl {
    public static void main(String[] args) {
        new Outer5().testPrivateInnerField();
    }
}
