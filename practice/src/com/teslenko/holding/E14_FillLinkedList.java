package com.teslenko.holding;

import java.util.*;

public class E14_FillLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        ListIterator<Integer> it = list.listIterator();
        for (int i = 0; i < 10; i++) {
            it.add(i);
            if (list.size() % 2 == 0) {
                it.previous();
            }
        }
        System.out.println(list);
    }
}
