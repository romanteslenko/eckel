package com.teslenko.polimorphism;

class Rodent {
    void eat() {
        System.out.println("Rodent eat");
    }

    void sleep() {
        System.out.println("Rodent sleep");
    }

    void run() {
        System.out.println("Rodent run");
    }
}

class Mouse extends Rodent {
    @Override
    void eat() {
        System.out.println("Mouse eat");
    }

    @Override
    void sleep() {
        System.out.println("Mouse sleep");
    }

    @Override
    void run() {
        System.out.println("Mouse run");
    }
}

class Hamster extends Rodent {
    @Override
    void eat() {
        System.out.println("Hamster eat");
    }

    @Override
    void sleep() {
        System.out.println("Hamster sleep");
    }

    @Override
    void run() {
        System.out.println("Hamster run");
    }
}

public class E09_Rodent {
    public static void main(String[] args) {
        Rodent[] rodents = {new Mouse(), new Hamster()};
        for (Rodent rodent : rodents) {
            rodent.sleep();
            rodent.run();
            rodent.eat();
        }
    }
}
