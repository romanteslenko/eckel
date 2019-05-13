package com.teslenko.holding;

import java.util.*;

interface Selector {
    boolean end();
    Object current();
    void next();
}

class Sequence {
    private List<Object> array = new ArrayList<>();
    void add(Object x) {
        array.add(x);
    }
    public Selector selector() {
        return new Selector() {
            private int i = 0;
            @Override
            public boolean end() {
                return i == array.size();
            }
            @Override
            public Object current() {
                return array.get(i);
            }
            @Override
            public void next() {
                if (!end()) {
                    i++;
                }
            }
        };
    }
}

public class E03_Sequence {
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}
