package com.teslenko.reusing;

class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("i=" + i + ", j=" + j);
    }

    private static int x1 = printInit("Static Insect.x1 inited");

    private static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

class Beetle extends Insect {

}

public class E24_Chafer {
}
