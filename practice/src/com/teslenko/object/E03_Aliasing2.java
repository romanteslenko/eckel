package com.teslenko.object;

/**
 * Created by roman on 25.05.2018.
 */

class Test {
    float data;

    void changeData(float data) {
        this.data = data;
    }
}

public class E03_Aliasing2 {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.data = 33.43f;
        t2.data = 9.34f;
        System.out.println("t1.data = " + t1.data + ", t2.data = " + t2.data);
        t1 = t2;
        System.out.println("t1.data = " + t1.data + ", t2.data = " + t2.data);
        t1.changeData(777.333f);
        System.out.println("t1.data = " + t1.data + ", t2.data = " + t2.data);
    }
}

