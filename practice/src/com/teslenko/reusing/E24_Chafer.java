package com.teslenko.reusing;

class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("i=" + i + ", j=" + j);
    }

    private static int x1 = printInit("Static Insect.x1 inited");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

class Beetle extends Insect {
    private int k = printInit("Field Beetle.k inited");

    Beetle() {
        System.out.println("k=" + k);
        System.out.println("j=" + j);
    }

    private static int x2 = printInit("Static Beetle.x2 inited");
}

public class E24_Chafer extends Beetle {
    private int z = printInit("Field Chafer.z inited");

    E24_Chafer() {
        System.out.println("z=" + z);
        System.out.println("j=" + j);
    }

    private static int x3 = printInit("Static Chafer.x3 inited");

    public static void main(String[] args) {
        E24_Chafer chafer = new E24_Chafer();
    }
}
