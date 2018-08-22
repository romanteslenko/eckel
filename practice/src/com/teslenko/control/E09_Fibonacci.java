package com.teslenko.control;

import java.util.Arrays;

public class E09_Fibonacci {
    static int[] fibosRec(int index) {
        int[] fibos = new int[index];
        for (int i = 0; i < index; i++) {
            fibos[i] = fibo(i + 1);
        }
        return fibos;
    }

    static int fibo(int index) {
        if (index <= 0) {
            return 0;
        }
        if (index == 1 || index == 2) {
            return 1;
        }
        return fibo(index - 1) + fibo(index - 2);
    }

    static int[] fibosIter(int index) {
        int[] fibos = new int[index];
        if (index >= 1) {
            fibos[0] = 1;
        }
        if (index >= 2) {
            fibos[1] = 1;
        }
        if (index > 2) {
            for (int i = 2; i < index; i++) {
                fibos[i] = fibos[i - 1] + fibos[i - 2];
            }
        }
        return fibos;
    }

    public static void main(String[] args) {
        int[] fibos = fibosIter(10);
        System.out.println("iter: " + Arrays.toString(fibos));
        int[] fibos2 = fibosRec(10);
        System.out.println("recursive: " + Arrays.toString(fibos2));
    }
}
