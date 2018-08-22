package com.teslenko.access;

class ProtectedContainer {
    protected int i = 8;
}

public class E06_PrivateTest {
    public static void main(String[] args) {
        ProtectedContainer pc = new ProtectedContainer();
        System.out.println(pc.i);
        pc.i = 88;
        System.out.println(pc.i);
    }
}
