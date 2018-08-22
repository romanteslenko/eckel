package com.teslenko.reusing;

class Art {
    Art() {
        System.out.println("art");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("drawing");
    }
}

class Cartoon extends Drawing {

}

public class E03_DefConGeneration {
    public static void main(String[] args) {
        new Cartoon();
    }
}
