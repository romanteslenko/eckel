package com.teslenko.polimorphism;

class Cycle {
    int wheels() {
        return 0;
    }
}

class Unicycle extends Cycle {
    @Override
    int wheels() {
        return 1;
    }
}

class Bicycle extends Cycle {
    @Override
    int wheels() {
        return 2;
    }
}

class Tricycle extends Cycle {
    @Override
    int wheels() {
        return 3;
    }
}

public class E01_E05_Cycles {
    static void ride(Cycle cycle) {
        System.out.println("riding " + cycle.wheels() + " wheels");
    }

    public static void main(String[] args) {
        Cycle[] cycles = {new Unicycle(), new Bicycle(), new Tricycle()};
        for (Cycle cycle : cycles) {
            ride(cycle);
        }
    }
}
