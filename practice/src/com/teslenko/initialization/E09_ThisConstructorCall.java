package com.teslenko.initialization;

public class E09_ThisConstructorCall {
    private int i;
    private int j;

    E09_ThisConstructorCall(int i, int j) {
        this.i = i;
        this.j = j;
        System.out.println("Value1 = " + this.i + ", Value2 = " + this.j);
    }

    E09_ThisConstructorCall(int i) {
        this(i, 777);
    }

    public static void main(String[] args) {
        E09_ThisConstructorCall test1 = new E09_ThisConstructorCall(15);
        E09_ThisConstructorCall test2 = new E09_ThisConstructorCall(6, 8);
    }
}
