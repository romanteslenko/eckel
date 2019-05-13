package com.teslenko.holding;

import java.util.*;

public class E18_HashVsLinkedMap {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(1, "one");
        hm.put(3, "three");
        hm.put(2, "two");
        hm.put(4, "four");
        System.out.println(hm);

        List<Integer> keys = new LinkedList<>(hm.keySet());
        keys.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer lhs, Integer rhs) {
                return rhs - lhs;
            }
        });
        System.out.println(keys);

        Map<Integer, String> lm = new LinkedHashMap<>();
        for (Integer key : keys) {
            lm.put(key, hm.getOrDefault(key, ""));
        }
        System.out.println(lm);
    }
}
