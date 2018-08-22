package com.teslenko.reusing;

class Component1 {
    public Component1() {
        System.out.println("Component 1");
    }

    void dispose() {
        System.out.println("destroying Component 1");
    }
}

class Component2 {
    public Component2() {
        System.out.println("Component 1");
    }

    void dispose() {
        System.out.println("destroying Component 2");
    }
}

class Component3 {
    public Component3() {
        System.out.println("Component 1");
    }

    void dispose() {
        System.out.println("destroying Component 3");
    }
}

class Root {
    private Component1 c1 = new Component1();
    private Component2 c2 = new Component2();
    private Component3 c3 = new Component3();

    Root() {
        System.out.println("Root");
    }

    void dispose() {
        System.out.println("destroying Root");
        c3.dispose();
        c2.dispose();
        c1.dispose();
    }
}

class Stem extends Root {
    private Component1 c1 = new Component1();
    private Component2 c2 = new Component2();
    private Component3 c3 = new Component3();

    Stem() {
        System.out.println("Stem");
    }

    void dispose() {
        System.out.println("destroying Steam");
        c3.dispose();
        c2.dispose();
        c1.dispose();
        super.dispose();
    }
}

public class E09_ConstructorsOrder2 {
    public static void main(String[] args) {
        new Stem();
    }
}
