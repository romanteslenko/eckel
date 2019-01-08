package com.teslenko.interfaces;

abstract class Rodent {
    Rodent() {
        System.out.println("Rodent()");
    }

    abstract void eat();

    abstract void sleep();

    abstract void run();

    @Override
    public String toString() {
        return "Abstract Rodent";
    }
}

class Mouse extends Rodent {

    public Mouse() {
        System.out.println("Mouse()");
    }

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

    @Override
    public String toString() {
        return "Mouse";
    }
}

class Hamster extends Rodent {

    public Hamster() {
        System.out.println("Hamster()");
    }

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

    @Override
    public String toString() {
        return "Hamster";
    }
}

class Gerbil extends Rodent {

    public Gerbil() {
        System.out.println("Gerbil()");
    }

    @Override
    void eat() {
        System.out.println("Gerbil eat");
    }

    @Override
    void sleep() {
        System.out.println("Gerbil sleep");
    }

    @Override
    void run() {
        System.out.println("Gerbil sleep");
    }

    @Override
    public String toString() {
        return "Gerbil";
    }
}

public class E01_AbstractRodent {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[] {new Mouse(), new Gerbil(), new Hamster()};
        for (Rodent rodent : rodents) {
            System.out.println(rodent + ":");
            rodent.eat();
            rodent.run();
            rodent.sleep();
        }
    }
}
