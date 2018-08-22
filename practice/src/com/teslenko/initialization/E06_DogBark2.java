package com.teslenko.initialization;

class Dog2 {
    void bark(int i, double d) {
        System.out.println("raf!");
    }

    void bark(double d, int i) {
        System.out.println("wow!");
    }
}

public class E06_DogBark2 {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.bark(4, 4.4);
        dog.bark(1.1, 1);
    }
}
