package com.teslenko.initialization;

enum Currency {
    USD, EUR, UAH, JPY, BGN, AUD
}

public class E21_CurrencyEnum {
    public static void main(String[] args) {
        for (Currency cur : Currency.values()) {
            System.out.println(cur + ", " + cur.ordinal());
        }
    }
}
