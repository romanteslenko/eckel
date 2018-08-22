package com.teslenko.initialization;

public class E22_CurrencySwitch {
    public static void main(String[] args) {
        for (Currency cur : Currency.values()) {
            switch(cur) {
                case USD:
                    System.out.println("United States dollar");
                    break;
                case EUR:
                    System.out.println("Euro");
                    break;
                case JPY:
                    System.out.println("Japanese yen");
                    break;
                case BGN:
                    System.out.println("Bulgarian lev");
                    break;
                case UAH:
                    System.out.println("Ukrainian hrivna");
                    break;
                case AUD:
                    System.out.println("Australian dollar");
                    break;
                default:
                    System.out.println("Unknown currency");
            }
        }
    }
}
