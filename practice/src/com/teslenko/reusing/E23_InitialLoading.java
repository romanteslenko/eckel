package com.teslenko.reusing;

import java.util.Random;

class Initiator {
    private static Random random = new Random();
    static int i = random.nextInt(100);
}

public class E23_InitialLoading {
    public static void main(String[] args) {
        System.out.println(Initiator.i);
        System.out.println(new Initiator().i);
    }
}
