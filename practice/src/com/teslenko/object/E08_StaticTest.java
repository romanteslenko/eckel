package com.teslenko.object;

/**
 * Created by roman on 14.04.2018.
 */
public class E08_StaticTest {
    static int i = 47;

    public static void main(String[] args) {
        E08_StaticTest staticTest1 = new E08_StaticTest();
        staticTest1.i++;
        System.out.println(i);
        E08_StaticTest staticTest2 = new E08_StaticTest();
        staticTest2.i++;
        System.out.println(i);
        E08_StaticTest staticTest3 = new E08_StaticTest();
        staticTest3.i++;
        System.out.println(i);
    }
}
