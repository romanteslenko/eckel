package com.teslenko.reusing;

class FinalMethodContainer {
    final void print() {
        System.out.println("Print in FinalMethodContainer");
    }
}

public class E21_FinalMethod extends FinalMethodContainer {
//    @Override
//    final void foo() {
//        System.out.println("Print in E21_FinalMethod");
//    }

    public static void main(String[] args) {
        new E21_FinalMethod().print();
    }
}
