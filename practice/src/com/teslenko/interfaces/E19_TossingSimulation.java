package com.teslenko.interfaces;

import java.util.Random;

interface TossingTool {
    Random rand = new Random();
    void use();
}

class Coin implements TossingTool {
    @Override
    public void use() {
        System.out.println(rand.nextInt(2));
    }
}

class Dice implements TossingTool {
    @Override
    public void use() {
        System.out.println(rand.nextInt(6) + 1);
    }
}

interface TossingFactory {
    void takeChanses();
}

class CoinTossingFactory implements TossingFactory {
    @Override
    public void takeChanses() {
        new Coin().use();
    }
}

class DiceTossingFactory implements TossingFactory {
    @Override
    public void takeChanses() {
        new Dice().use();
    }
}

public class E19_TossingSimulation {
    static void simulate(TossingFactory factory) {
        factory.takeChanses();
    }

    public static void main(String[] args) {
        simulate(new CoinTossingFactory());
        simulate(new DiceTossingFactory());
    }
}
