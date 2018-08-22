package com.teslenko.control;

public class E04_Primes {
    public static void main(String[] args) {
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            boolean prime = true;
            for (int j = 2; j < i && prime; j++) {
                if (i % j == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.println(i);
            }
        }
    }
}

