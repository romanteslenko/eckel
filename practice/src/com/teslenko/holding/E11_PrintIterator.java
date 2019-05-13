package com.teslenko.holding;

import java.util.*;

public class E11_PrintIterator {
    static void display(Collection collection) {
        for (Object o : collection) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<Integer> al  = new ArrayList<>();
        Set<String> hs = new HashSet<>();
        Collection<Float> ls = new LinkedHashSet<>();
        for (int i = 10; i >= 0; i--) {
            al.add(i);
            hs.add("str" + i);
            ls.add((float) i);
        }
        display(al);
        display(hs);
        display(ls);
    }
}
