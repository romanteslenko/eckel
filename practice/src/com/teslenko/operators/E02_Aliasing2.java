package com.teslenko.operators;

public class E02_Aliasing2 {
    private static void changeData(FloatWrapper floatWrapper) {
        floatWrapper.data = 7.77f;
    }

    public static void main(String[] args) {
        FloatWrapper fw = new FloatWrapper();
        fw.data = 1.1f;
        System.out.println("data = " + fw.data);
        changeData(fw);
        System.out.println("data = " + fw.data);
    }
}
