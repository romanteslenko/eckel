package com.teslenko.operators;

public class E10_BitwiseOperators {
    public static void main(String[] args) {
        int i1 = 0x5;
        System.out.println("     i1 = 0" + Integer.toBinaryString(i1));
        int i2 = 0xa;
        System.out.println("     i2 = " + Integer.toBinaryString(i2));
        System.out.println("i1 & i1 = " + Integer.toBinaryString(i1 & i1));
        System.out.println("i1 & i2 = " + Integer.toBinaryString(i1 & i2));
        System.out.println("i1 | i1 = " + Integer.toBinaryString(i1 | i1));
        System.out.println("i1 | i2 = " + Integer.toBinaryString(i1 | i2));
        System.out.println("i1 ^ i1 = " + Integer.toBinaryString(i1 | i1));
        System.out.println("i1 ^ i2 = " + Integer.toBinaryString(i1 | i2));
        System.out.println("    ~i1 = " + Integer.toBinaryString(~i1));
        System.out.println("    ~i2 = " + Integer.toBinaryString(~i2));
    }
}
