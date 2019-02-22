package com.teslenko.innerclasses;

interface Selector {
    boolean end();
    Object current();
    void next();
}

class Sequence {
    private Object[] items;
    private int next;
    Sequence(int size) {
        items = new Object[size];
    }

    void add(Object item) {
        if (next < items.length) {
            items[next++] = item;
        }
    }

    Selector selector() {
        return new SequenceSelector();
    }

    void checkSelectorSequenceLink() {
        System.out.println("SequenceSelector link to its parent " +
                (new SequenceSelector().sequence() == this ? "is equal" : "isn't equal") +
                " to this sequence instance");
    }

    private class SequenceSelector implements Selector {
        int i;
        @Override
        public boolean end() {
            return i == items.length;
        }
        @Override
        public Object current() {
            return items[i];
        }
        @Override
        public void next() {
            if (!end()) {
                i++;
            }
        }
        Sequence sequence() {
            return Sequence.this;
        }
    }
}

class StringWrapper {
    private String str;
    StringWrapper(String str) {
        this.str = str;
    }
    @Override
    public String toString() {
        return str;
    }
}

public class E02_StringSequence {
    public static void main(String[] args) {
        Sequence seq = new Sequence(3);
        for (int i = 0; i < 3; i++) {
            seq.add(new StringWrapper("wrapper " + i));
        }
        Selector it = seq.selector();
        while (!it.end()) {
            System.out.println(it.current());
            it.next();
        }
    }
}
