package com.teslenko.control;

import java.util.Random;

public class E03_RandomInts2 {
    public static void main(String[] args) {
        Random random = new Random();
        while (true) {
            E02_RandomInts.compare(random.nextInt(100), random.nextInt(100));
        }
    }
}
