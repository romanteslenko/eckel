package com.teslenko.operators;

public class E08_LongLiterals {
    public static void main(String[] args) {
        long l16 = 0xfL;
        System.out.println(l16);
        System.out.println("Long in 16: " + Long.toBinaryString(l16));
        long l8 = 017L;
        System.out.println(l8);
        System.out.println("Long in 8: " + Long.toBinaryString(l8));
    }
}
