package com.teslenko.operators;

public class E01_Aliasing {
    public static void main(String[] args) {
        FloatWrapper fw1 = new FloatWrapper();
        FloatWrapper fw2 = new FloatWrapper();
        fw1.data = 1.1f;
        fw2.data = 2.2f;
        System.out.println("fw1=" + fw1.data + ", fw2=" + fw2.data);
        fw1 = fw2;
        System.out.println("fw1=" + fw1.data + ", fw2=" + fw2.data);
        fw1.data = 3.3f;
        System.out.println("fw1=" + fw1.data + ", fw2=" + fw2.data);
    }
}

class FloatWrapper {
    float data;
}
