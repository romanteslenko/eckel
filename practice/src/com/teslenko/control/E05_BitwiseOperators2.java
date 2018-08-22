package com.teslenko.control;

public class E05_BitwiseOperators2 {
    static void printBinary(int i) {
        int[] bits = new int[32];
        for (int bitIndex = bits.length - 1; bitIndex >= 0; bitIndex--) {
            bits[bitIndex] = i & 1;
            i >>>= 1;
        }
        for (int bit : bits) {
            System.out.print(bit);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printBinary(0x5);
        printBinary(0xA);
        printBinary(0x5 & 0xA);
        printBinary(0x5 | 0xA);
        printBinary(0x5 ^ 0xA);
        printBinary(0x5 & 0x5);
        printBinary(0x5 | 0x5);
        printBinary(0x5 ^ 0x5);
        printBinary(~0x5);
        printBinary(~0xA);
    }
}
