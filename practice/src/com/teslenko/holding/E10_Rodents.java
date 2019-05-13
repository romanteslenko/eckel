package com.teslenko.holding;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

abstract class Rodent {
    abstract void eat();
    abstract void sleep();
    abstract void run();
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

public class E10_Rodents {
    public static void main(String[] args) {
        List<Rodent> rodents = new ArrayList<>();
        rodents.add(new Hamster());
        rodents.add(new Mouse());
        Iterator<Rodent> it = rodents.iterator();
        while (it.hasNext()) {
            Rodent rodent = it.next();
            rodent.eat();
            rodent.sleep();
            rodent.run();
        }
    }
}
