package com.teslenko.control;

public class E08_SwitchTest {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    System.out.println("case 0");
//                    break;
                case 1:
                    System.out.println("case 1");
//                    break;
                case 2:
                    System.out.println("case 2");
//                    break;
                case 3:
                    System.out.println("case 3");
//                    break;
                default:
                    System.out.println("default");
            }
        }
    }
}
