package com.teslenko.holding;

import java.util.*;

public class E06_StringListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<String> Strings = new ArrayList<>(Arrays.asList("aaa", "sss", "qqq", "bbb", "ccc"));
        System.out.println("1: " + Strings);
        String h = "ddd";
        Strings.add(h); // Automatically resizes
        System.out.println("2: " + Strings);
        System.out.println("3: " + Strings.contains(h));
        Strings.remove(h); // Remove by object
        String p = Strings.get(2);
        System.out.println("4: " +  p + " " + Strings.indexOf(p));
        String c = "eee";
        System.out.println("5: " + Strings.indexOf(c));
        System.out.println("6: " + Strings.remove(c));
        // Must be the exact object:
        System.out.println("7: " + Strings.remove(p));
        System.out.println("8: " + Strings);
        Strings.add(3, "zzz"); // Insert at an index
        System.out.println("9: " + Strings);
        List<String> sub = Strings.subList(1, 4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + Strings.containsAll(sub));
        Collections.sort(sub); // In-place sort
        System.out.println("sorted subList: " + sub);
        // Order is not important in containsAll():
        System.out.println("11: " + Strings.containsAll(sub));
        Collections.shuffle(sub, rand); // Mix it up
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + Strings.containsAll(sub));
        List<String> copy = new ArrayList<>(Strings);
        sub = Arrays.asList(Strings.get(1), Strings.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<>(Strings); // Get a fresh copy
        copy.remove(2); // Remove by index
        System.out.println("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        System.out.println("15: " + copy);
        copy.set(1, "kkk"); // Replace an element
        System.out.println("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        System.out.println("17: " + copy);
        System.out.println("18: " + Strings.isEmpty());
        Strings.clear(); // Remove all elements
        System.out.println("19: " + Strings);
        System.out.println("20: " + Strings.isEmpty());
        Strings.addAll(Arrays.asList("fff", "ggg", "hhh", "jjj"));
        System.out.println("21: " + Strings);
        Object[] o = Strings.toArray();
        System.out.println("22: " + Arrays.toString(o));
        String[] pa = Strings.toArray(new String[0]);
        System.out.println("23: " + Arrays.toString(new String[0]));
    }
}
