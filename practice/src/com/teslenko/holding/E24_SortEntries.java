package com.teslenko.holding;

import java.util.*;

public class E24_SortEntries {
    public static void main(String[] args) {
        Map<String, String> map1 = new LinkedHashMap<>();
        map1.put("aaa", "test1");
        map1.put("ccc", "test2");
        map1.put("bbb", "test3");
        System.out.println(map1);

        String[] keys = map1.keySet().toArray(new String[0]);
        Arrays.sort(keys);

        Map<String, String> map2 = new LinkedHashMap<>();
        for (String key : keys) {
            map2.put(key, map1.get(key));
        }
        System.out.println(map2);
    }
}
