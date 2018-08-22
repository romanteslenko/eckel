package com.teslenko.access;

public class E05_ModifiersTest {
    private int x;
    protected int y;
    int z;
    public int w;

    private void f1() {};
    protected void f2() {};
    void f3() {};
    public void f4() {};

    public static void main(String[] args) {
        E05_ModifiersTest mt = new E05_ModifiersTest();
        mt.x = 1;
        mt.y = 2;
        mt.z = 3;
        mt.w = 4;
        mt.f1();
        mt.f2();
        mt.f3();
        mt.f4();
    }
}
