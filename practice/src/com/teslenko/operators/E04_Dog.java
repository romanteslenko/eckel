package com.teslenko.operators;

class Dog {
    String name;
    String says;
}

public class E04_Dog {
    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.name = "Spot";
        spot.says = "Gav!";
        Dog scruffy = new Dog();
        scruffy.name = "Scruffy";
        scruffy.says = "Vaf!";
        System.out.println(spot.name + " says '" + spot.says + "'");
        System.out.println(scruffy.name + " says '" + scruffy.says + "'");
    }
}
