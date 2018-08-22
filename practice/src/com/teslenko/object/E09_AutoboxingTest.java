package com.teslenko.object;

/**
 * Created by roman on 14.04.2018.
 */
public class E09_AutoboxingTest {
    byte b = 3;
    short s = 17;
    int i = 47;
    long l = 1_000_001L;
    float f = 34.87f;
    double d = 93.37;
    boolean bool = true;
    char ch = 'x';

    public static void main(String[] args) {
        E09_AutoboxingTest e09_autoboxingTest = new E09_AutoboxingTest();
        Byte bw = e09_autoboxingTest.b;
        System.out.println(bw);
        Short sw = e09_autoboxingTest.s;
        System.out.println(sw);
        Integer iw = e09_autoboxingTest.i;
        System.out.println(iw);
        Long lw = e09_autoboxingTest.l;
        System.out.println(lw);
        Float fw = e09_autoboxingTest.f;
        System.out.println(fw);
        Double dw = e09_autoboxingTest.d;
        System.out.println(dw);
        Boolean boolw = e09_autoboxingTest.bool;
        System.out.println(boolw);
        Character chw = e09_autoboxingTest.ch;
        System.out.println(chw);
    }
}
