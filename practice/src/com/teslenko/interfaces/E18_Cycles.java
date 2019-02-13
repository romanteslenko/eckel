package com.teslenko.interfaces;

interface Cycle {}

class Unicycle implements Cycle {
    Unicycle() {
        System.out.println("Unicycle");
    }
}

class Bicycle implements Cycle {
    Bicycle() {
        System.out.println("Bicycle");
    }
}

class Tricycle implements Cycle {
    Tricycle() {
        System.out.println("Tricycle");
    }
}

interface CycleFactory {
    Cycle createCycle();
}

class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle createCycle() {
        return new Unicycle();
    }
}

class BicycleFactory implements CycleFactory {
    @Override
    public Cycle createCycle() {
        return new Bicycle();
    }
}

class TricycleFactory implements CycleFactory {
    @Override
    public Cycle createCycle() {
        return new Tricycle();
    }
}

public class E18_Cycles {
    static void testCycle(CycleFactory factory) {
        factory.createCycle();
    }

    public static void main(String[] args) {
        testCycle(new UnicycleFactory());
        testCycle(new BicycleFactory());
        testCycle(new TricycleFactory());
    }
}
