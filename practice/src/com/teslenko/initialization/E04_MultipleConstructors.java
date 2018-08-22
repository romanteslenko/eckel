package com.teslenko.initialization;

public class E04_MultipleConstructors {
    E04_MultipleConstructors() {
        System.out.println("this is default constructor");
    }

    E04_MultipleConstructors(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        new E04_MultipleConstructors();
        new E04_MultipleConstructors("this is constructor with String parameter");
    }
}
