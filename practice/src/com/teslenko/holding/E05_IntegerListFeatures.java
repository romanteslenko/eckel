package com.teslenko.holding;

import java.util.*;

public class E05_IntegerListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Integer> Integers = new ArrayList<>(Arrays.asList(1, 4, 2, 5, 3));
        System.out.println("1: " + Integers);
        Integer h = 6;
        Integers.add(h); // Automatically resizes
        System.out.println("2: " + Integers);
        System.out.println("3: " + Integers.contains(h));
        Integers.remove(h); // Remove by object
        Integer p = Integers.get(2);
        System.out.println("4: " +  p + " " + Integers.indexOf(p));
        Integer c = 7;
        System.out.println("5: " + Integers.indexOf(c));
        System.out.println("6: " + Integers.remove(c));
        // Must be the exact object:
        System.out.println("7: " + Integers.remove(p));
        System.out.println("8: " + Integers);
        Integers.add(3, 8); // Insert at an index
        System.out.println("9: " + Integers);
        List<Integer> sub = Integers.subList(1, 4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + Integers.containsAll(sub));
        Collections.sort(sub); // In-place sort
        System.out.println("sorted subList: " + sub);
        // Order is not important in containsAll():
        System.out.println("11: " + Integers.containsAll(sub));
        Collections.shuffle(sub, rand); // Mix it up
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + Integers.containsAll(sub));
        List<Integer> copy = new ArrayList<>(Integers);
        sub = Arrays.asList(Integers.get(1), Integers.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<>(Integers); // Get a fresh copy
        copy.remove(2); // Remove by index
        System.out.println("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        System.out.println("15: " + copy);
        copy.set(1, 0); // Replace an element
        System.out.println("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        System.out.println("17: " + copy);
        System.out.println("18: " + Integers.isEmpty());
        Integers.clear(); // Remove all elements
        System.out.println("19: " + Integers);
        System.out.println("20: " + Integers.isEmpty());
        Integers.addAll(Arrays.asList(11, 12, 13, 14));
        System.out.println("21: " + Integers);
        Object[] o = Integers.toArray();
        System.out.println("22: " + Arrays.toString(o));
        Integer[] pa = Integers.toArray(new Integer[0]);
        System.out.println("23: " + Arrays.toString(new Integer[0]));
    }
}
