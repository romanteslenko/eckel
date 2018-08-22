package com.teslenko.reusing;

class EmptyFinalTest {
    private String msg;

    EmptyFinalTest(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}

public class E19_EmptyFinal {
    final EmptyFinalTest eft;

    E19_EmptyFinal() {
        eft = new EmptyFinalTest("default constructor");
    }

    E19_EmptyFinal(String msg) {
        eft = new EmptyFinalTest(msg);
    }

    public static void main(String[] args) {
        System.out.println(new E19_EmptyFinal().eft);
        System.out.println(new E19_EmptyFinal("parametrized constructor").eft);
        E19_EmptyFinal test = new E19_EmptyFinal();
        //test.eft = new EmptyFinalTest("change");
    }
}
