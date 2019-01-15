package com.teslenko.interfaces;

interface IRodent {
    void eat();
    void sleep();
    void run();
}

class Mouse2 implements IRodent {

    @Override
    public void eat() {
        System.out.println("Mouse eat");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse sleep");
    }

    @Override
    public void run() {
        System.out.println("Mouse run");
    }

    @Override
    public String toString() {
        return "Mouse2";
    }
}

class Hamster2 implements IRodent {

    @Override
    public void eat() {
        System.out.println("Hamster eat");
    }

    @Override
    public void sleep() {
        System.out.println("Hamster sleep");
    }

    @Override
    public void run() {
        System.out.println("Hamster run");
    }

    @Override
    public String toString() {
        return "Hamster2";
    }
}

class Gerbil2 implements IRodent {

    @Override
    public void eat() {
        System.out.println("Gerbil eat");
    }

    @Override
    public void sleep() {
        System.out.println("Gerbil sleep");
    }

    @Override
    public void run() {
        System.out.println("Gerbil run");
    }

    @Override
    public String toString() {
        return "Gerbil2";
    }
}

public class E07_RodentInterface {
    public static void main(String[] args) {
        IRodent[] rodents = new IRodent[] {new Mouse2(), new Hamster2(), new Gerbil2()};
        for (IRodent rodent : rodents) {
            rodent.eat();
            rodent.run();
            rodent.sleep();
        }
    }
}
