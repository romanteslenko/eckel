package com.teslenko.holding;

import java.util.*;

class Characters {
    private String[] names = new String[] { "Iron Man", "Halk", "Thor", "Black widow", "Ant man", "Spider man", "Captain America"};
    private int i = 0;
    String next() {
        if (i == names.length) {
            i = 0;
        }
        return names[i++];
    }
}

public class E04_Avengers {
    public static void main(String[] args) {
        Characters avengers = new Characters();
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = avengers.next();
        }
        List<String> arrayList = Arrays.asList(array);
        List<String> linkedList = Arrays.asList(array);
        Set<String> hashSet = new HashSet<>(arrayList);
        Set<String> linkedHashSet = new LinkedHashSet<>(arrayList);
        Set<String> treeSet = new TreeSet<>(arrayList);

        System.out.println(Arrays.toString(array));
        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }
}
