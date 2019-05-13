package com.teslenko.holding;

import java.util.*;

public class E05_ReversListIterator {
    public static void main(String[] args) {
        List<Integer> forward = new ArrayList<>();
        List<Integer> reverse = new ArrayList<>();
        for (int i = 100; i <= 110; i++) {
            forward.add(i);
        }
        System.out.println(forward);
        ListIterator<Integer> it = forward.listIterator(forward.size());
        while (it.hasPrevious()) {
            reverse.add(it.previous());
        }
        System.out.println(reverse);
        reverse.clear();
    }
}
