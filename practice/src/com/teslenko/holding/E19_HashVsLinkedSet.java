package com.teslenko.holding;

import java.util.*;

public class E19_HashVsLinkedSet {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("bbb");
        hs.add("ccc");
        hs.add("aaa");
        System.out.println(hs);

        String[] values = hs.toArray(new String[0]);
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));

        Set<String> ls = new LinkedHashSet<>();
        Collections.addAll(ls, values);
        System.out.println(ls);
    }
}
