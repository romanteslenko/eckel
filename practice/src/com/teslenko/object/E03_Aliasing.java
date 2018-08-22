package com.teslenko.object;

/**
 * Created by roman on 25.05.2018.
 */
class Task {
    float data;
}

public class E03_Aliasing {
    public static void main(String[] args) {
        Task t1 = new Task();
        Task t2 = new Task();
        t1.data = 3.7f;
        t2.data = 1.6f;
        System.out.println("t1.data=" + t1.data + ", t2.data=" + t2.data);
        t1 = t2;
        System.out.println("t1.data=" + t1.data + ", t2.data=" + t2.data);
        t1.data = 5.9f;
        System.out.println("t1.data=" + t1.data + ", t2.data=" + t2.data);
    }
}
