package com.teslenko.control;

import java.util.Random;

public class E02_RandomInts {
    static void compare(int lhs, int rhs) {
        if (lhs > rhs) {
            System.out.println(lhs + " > " + rhs);
        } else if (lhs == rhs) {
            System.out.println(lhs + " = " + rhs);
        } else {
            System.out.println(lhs + " < " + rhs);
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            compare(random.nextInt(100), random.nextInt(100));
        }
    }
}
