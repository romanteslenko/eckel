package com.teslenko.holding;

import java.util.*;

class A {
    private static int count = 0;
    private final int id = count++;
    @Override
    public String toString() {
        return Integer.toString(id);
    }
}

public class E07_ListTest {
    public static void main(String[] args) {
        A[] a = new A[]{new A(), new A(), new A(), new A()};
        List<A> l = new ArrayList<>(Arrays.asList(a));
        List<A> s = l.subList(1, 3);
        l.removeAll(s);
        System.out.println(l);
    }
}
