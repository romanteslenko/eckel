package com.teslenko.reusing;

class Component12 {
    public Component12(int i) {
        System.out.println("Component 1... " + i);
    }
}

class Component22 {
    public Component22(int i) {
        System.out.println("Component 1... " + i);
    }
}

class Component32 {
    public Component32(int i) {
        System.out.println("Component 1... " + i);
    }
}

class Root2 {
    private Component12 c1;
    private Component22 c2;
    private Component32 c3;

    Root2(int i) {
        System.out.println("Root... " + i);
        c1 = new Component12(i);
        c2 = new Component22(i);
        c3 = new Component32(i);
    }
}

class Stem2 extends Root2 {
    private Component12 c1;
    private Component22 c2;
    private Component32 c3;

    Stem2(int i) {
        super(i);
        System.out.println("Stem... " + i);
        c1 = new Component12(i);
        c2 = new Component22(i);
        c3 = new Component32(i);
    }
}

public class E10_ConstructorsOrder3 {
    public static void main(String[] args) {
        new Stem2(77);
    }
}
