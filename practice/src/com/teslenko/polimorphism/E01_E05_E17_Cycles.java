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

    void balance() {
        System.out.println("Unicycle.balance()");
    }
}

class Bicycle extends Cycle {
    @Override
    int wheels() {
        return 2;
    }

    void balance() {
        System.out.println("Bicycle.balance()");
    }
}

class Tricycle extends Cycle {
    @Override
    int wheels() {
        return 3;
    }
}

public class E01_E05_E17_Cycles {
    static void ride(Cycle cycle) {
        System.out.println("riding " + cycle.wheels() + " wheels");
    }

    public static void main(String[] args) {
        Cycle[] cycles = {new Unicycle(), new Bicycle(), new Tricycle()};
        for (Cycle cycle : cycles) {
            ride(cycle);
            // cycle.balance();
        }
        ((Unicycle) cycles[0]).balance();
        ((Bicycle) cycles[1]).balance();
        // ((Tricycle) cycles[2]).balance();
    }
}
