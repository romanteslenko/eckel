package com.teslenko.reusing;

class Parent {
    private void hey() {
        System.out.println("hey, I'm a parent");
    }
}

class Child {
//    @Override
    void hey() {
        System.out.println("hey, I'm a child");
    }
}

public class E20_OverridingAnnotation {
    public static void main(String[] args) {
        new Child().hey();
    }
}
