package com.teslenko.innerclasses;

class Outer4 {
    private int i = 99;
    private void printI() {
        System.out.println("i = " + i);
    }
    void testInner() {
        new Inner().modify();
    }

    private class Inner {
        void modify() {
            i = 77;
            printI();
        }
    }
}

public class E07_OuterPrivateMembersControl {
    public static void main(String[] args) {
        new Outer4().testInner();
    }
}
