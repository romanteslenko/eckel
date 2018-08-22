package com.teslenko.object;

/**
 * Created by roman on 14.04.2018.
 */
public class E07_Incrementable {

    static void increment() {
        StaticTest.i++;
    }

    public static void main(String[] args) {
        System.out.println("Value before increment = " + StaticTest.i);
        E07_Incrementable e07_Incrementable = new E07_Incrementable();
        e07_Incrementable.increment();
        System.out.println("Value after increment on object = " + StaticTest.i);
        E07_Incrementable.increment();
        System.out.println("Value after increment on class = " + StaticTest.i);
        increment();
        System.out.println("Value after direct increment call = " + StaticTest.i);
    }
}

class StaticTest {
    static int i = 47;
}