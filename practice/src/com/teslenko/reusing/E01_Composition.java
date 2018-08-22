package com.teslenko.reusing;

class Internal {
    private static int count = 0;

    Internal() {
        System.out.println("Internal class " + ++count + " created");
    }
}

class Wrapper {
    private Internal internal;

    Wrapper() {
        System.out.println("new Wrapper created");
    }

    void initialize() {
        internal = new Internal();
    }
}

public class E01_Composition {
    public static void main(String[] args) {
        Wrapper wrapper = new Wrapper();
        wrapper.initialize();
    }
}
