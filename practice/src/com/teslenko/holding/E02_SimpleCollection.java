package com.teslenko.holding;

import java.util.*;

public class E02_SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
            c.add(i); // won't be added to Set
        }
        for (Integer i : c) {
            System.out.print(i + ", ");
        }
    }
}
