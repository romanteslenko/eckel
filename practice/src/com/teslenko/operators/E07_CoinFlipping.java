package com.teslenko.operators;

import java.util.Random;

public class E07_CoinFlipping {
    public static void main(String[] args) {
        Random random = new Random();
        int coinValue = random.nextInt(100);
        System.out.println(coinValue >= 50 ? "head" : "tail");
    }
}
