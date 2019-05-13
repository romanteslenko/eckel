package com.teslenko.holding;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

class IteratorSequence {
    private List<Object> list = new ArrayList<>();
    void add(Object x) {
        list.add(x);
    }
    Iterator iterator() {
        return new Iterator() {
            private int i = 0;
            @Override
            public boolean hasNext() {
                return i < list.size();
            }
            @Override
            public Object next() {
                if (hasNext()) {
                    return list.get(i++);
                } else {
                    throw new NoSuchElementException();
                }
            }
        };
    }
}

public class E09_IteratorSequence {
    public static void main(String[] args) {
        IteratorSequence sequence = new IteratorSequence();
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Iterator<Integer> it = sequence.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
