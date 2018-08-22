package com.teslenko.reusing;

class BaseNonDefault {
    BaseNonDefault(int i) {
        System.out.println("Base class non default constructor");
    }
}

class ChildMultiConstructor extends BaseNonDefault {
    ChildMultiConstructor() {
        super(0);
        System.out.println("ChildMultiConstructor class default constructor");
    }

    ChildMultiConstructor(int i) {
        super(i);
        System.out.println("ChildMultiConstructor class non default constructor");
    }
}

public class E08_CallSuperConstructor {
    public static void main(String[] args) {
        new ChildMultiConstructor();
        new ChildMultiConstructor(10);
    }
}
