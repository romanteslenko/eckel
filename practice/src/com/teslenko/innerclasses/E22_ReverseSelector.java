package com.teslenko.innerclasses;

class Sequence2 extends Sequence {
    Sequence2(int size) {
        super(size);
    }

    Selector reverseSelector() {
        return new ReverseSelector();
    }

    private class ReverseSelector implements Selector {
        private int i = items.length - 1;
        @Override
        public boolean end() {
            return i == -1;
        }
        @Override
        public Object current() {
            return items[i];
        }
        @Override
        public void next() {
            if (!end()) {
                i--;
            }
        }
    }
}

public class E22_ReverseSelector {
    public static void main(String[] args) {
        Sequence2 seq = new Sequence2(10);
        for (int i = 0; i < 10; i++) {
            seq.add(i);
        }
        Selector it = seq.reverseSelector();
        while (!it.end()) {
            System.out.println(it.current());
            it.next();
        }
    }
}
