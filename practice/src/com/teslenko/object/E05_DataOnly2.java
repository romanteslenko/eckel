package com.teslenko.object;

/**
 * Created by roman on 14.04.2018.
 */
public class E05_DataOnly2 {
    public static void main(String[] args) {
        E04_DataOnly e04_dataOnly = new E04_DataOnly();
        e04_dataOnly.i = 47;
        e04_dataOnly.d = 1.1;
        e04_dataOnly.b = false;
        System.out.println("i=" + e04_dataOnly.i);
        System.out.println("d=" + e04_dataOnly.d);
        System.out.println("b=" + e04_dataOnly.b);
    }
}
