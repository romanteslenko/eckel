package com.teslenko.reusing;

import java.util.Random;

public class E18_Final {
    private static Random random = new Random();
    private static final int I = random.nextInt();
    private final int j = random.nextInt();

    @Override
    public String toString() {
        return "I=" + I + ", j=" + j;
    }

    public static void main(String[] args) {
        E18_Final instance1 = new E18_Final();
        System.out.println(instance1);
        E18_Final instance2 = new E18_Final();
        System.out.println(instance2);
    }
}
