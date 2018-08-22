package com.teslenko.initialization;

public class E15_InstanceInitialization {
    String str;

    {
        str = "instance initialization";
        System.out.println(str);
    }

    static {   // Static initialization block goes first anyway
        System.out.println("static initialization");
    }

    public static void main(String[] args) {
        new E15_InstanceInitialization();
    }
}
