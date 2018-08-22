package com.teslenko.initialization;

class Wrapper {
    Wrapper(String param) {
        System.out.println(param);
    }
}

public class E17_EmptyReferencesArray {
    public static void main(String[] args) {
        Wrapper[] wrappers = new Wrapper[5];
    }
}
