package com.teslenko.initialization;

class Dog {
    void bark(byte b) {
        System.out.println("wooooo!");
    }

    void bark(int i) {
        System.out.println("gav!");
    }

    void bark(long l) {
        System.out.println("rrraaaff!!!");
    }
}

public class E05_DogBark {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark((byte) 1);
        dog.bark(1);
        dog.bark(1L);
    }
}
