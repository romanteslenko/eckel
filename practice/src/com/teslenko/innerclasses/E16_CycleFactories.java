package com.teslenko.innerclasses;

interface Cycle {}

interface CycleFactory {
    Cycle createCycle();
}

class Unicycle implements Cycle {
    Unicycle() {
        System.out.println("Unicycle");
    }

    static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle createCycle() {
            return new Unicycle();
        }
    };
}

class Bicycle implements Cycle {
    Bicycle() {
        System.out.println("Bicycle");
    }

    static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle createCycle() {
            return new Bicycle();
        }
    };
}

class Tricycle implements Cycle {
    Tricycle() {
        System.out.println("Tricycle");
    }

    static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle createCycle() {
            return new Tricycle();
        }
    };
}

public class E16_CycleFactories {
    static void testCycle(CycleFactory factory) {
        factory.createCycle();
    }

    public static void main(String[] args) {
        testCycle(Unicycle.factory);
        testCycle(Bicycle.factory);
        testCycle(Tricycle.factory);
    }
}
