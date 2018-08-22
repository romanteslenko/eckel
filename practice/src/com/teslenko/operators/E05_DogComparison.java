package com.teslenko.operators;

public class E05_DogComparison {
    private static void compare(Dog lhs, Dog rhs) {
        System.out.println("references == " + (lhs == rhs));
        System.out.println("references.equals " + (lhs.equals(rhs)));
        System.out.println("names == " + (lhs.name == rhs.name));
        System.out.println("names.equals " + (lhs.name.equals(lhs.name)));
        System.out.println("says == " + (lhs.says == rhs.says));
        System.out.println("says.equals " + (lhs.says.equals(lhs.says)));
    }

    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.name = "Spot";
        spot.says = "Gav!";
        Dog scruffy = new Dog();
        scruffy.name = "Scruffy";
        scruffy.says = "Vaf!";
        Dog dog3 = spot;
        compare(spot, dog3);
        compare(spot, scruffy);
    }
}
