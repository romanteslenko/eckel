package com.teslenko.control;

import java.util.Arrays;

public class E10_Vampires {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            if (i % 10 == 0) {
                continue;
            }
            int[] digits = integerToArray(i);

        }
    }

    private static int[] integerToArray(int value) {
        int[] digits = new int[4];
        for (int i = 3; i >= 0; i--) {
            digits[i] = value % 10;
            value /= 10;
        }
        return digits;
    }
}
