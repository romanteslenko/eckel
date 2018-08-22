package com.teslenko.reusing;

class A2 {
    A2(int i) {
        System.out.println("A with arg");
    }
}

class B2 {
    B2(int i) {
        System.out.println("B with arg");
    }
}

class C2 extends A2 {
    private B2 b2;

    C2(int i) {
        super(i);
        b2 = new B2(i);
        System.out.println("C with arg");
    }
}

public class E07_SimpleInheritance2 {
    public static void main(String[] args) {
        new C2(777);
    }
}
