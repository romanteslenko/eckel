package com.teslenko.control;

public class E07_LoopFrom0To99 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i == 99) {
                break;
            }
        }
    }
}
