package com.teslenko.innerclasses;

import java.util.Random;

interface TossingTool {
    Random rand = new Random();
    void use();
}

interface TossingFactory {
    void takeChances();
}

class Coin implements TossingTool {
    @Override
    public void use() {
        System.out.println(rand.nextInt(2));
    }

    static TossingFactory factory = new TossingFactory() {
        @Override
        public void takeChances() {
            new Coin().use();
        }
    };
}

class Dice implements TossingTool {
    @Override
    public void use() {
        System.out.println(rand.nextInt(6) + 1);
    }

    static TossingFactory factory = new TossingFactory() {
        @Override
        public void takeChances() {
            new Dice().use();
        }
    };
}

public class E17_Tossing {
    static void simulate(TossingFactory factory) {
        factory.takeChances();
    }

    public static void main(String[] args) {
        simulate(Coin.factory);
        simulate(Dice.factory);
    }
}
