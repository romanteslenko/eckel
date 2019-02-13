package com.teslenko.interfaces;

interface IWithFields {
    int I = init();

    static int init() {
        System.out.println("Init");
        return 10;
    }
}

public class E17_InterfacesFields implements IWithFields {
    public static void main(String[] args) {
        System.out.println("I=" + IWithFields.I);
        //I = 99; // Compiler error: Cannot assign a value to final variable I
    }
}
