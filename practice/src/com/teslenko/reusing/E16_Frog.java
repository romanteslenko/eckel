package com.teslenko.reusing;

class Amphibian {
    void dive() {
        System.out.println("Amphibian dive");
    }

    void swim() {
        System.out.println("Amphibian swim");
    }
}

class Frog extends Amphibian {}

public class E16_Frog {
    public static void main(String[] args) {
        Amphibian frog = new Frog();
        frog.swim();
        frog.dive();
    }
}
