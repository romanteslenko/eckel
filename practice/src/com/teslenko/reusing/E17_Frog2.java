package com.teslenko.reusing;

class Frog2 extends Amphibian {
    @Override
    void swim() {
        System.out.println("Frog2 swim");
    }

    @Override
    void dive() {
        System.out.println("Frog2 dive");
    }
}

public class E17_Frog2 {
    public static void main(String[] args) {
        Amphibian frog2 = new Frog2();
        frog2.swim();
        frog2.dive();
    }
}
