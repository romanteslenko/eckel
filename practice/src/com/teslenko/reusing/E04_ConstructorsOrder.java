package com.teslenko.reusing;

class Base1 {
    Base1() {
        System.out.println("base1");
    }
}

class Derived1 extends Base1 {
    Derived1() {
        System.out.println("derived1");
    }
}

class Derived2 extends Derived1 {
    Derived2(int i) {
        System.out.println("derived2 " + " parametrized constructor");
    }
}

public class E04_ConstructorsOrder {
    public static void main(String[] args) {
        new Derived2(1);
    }
}
