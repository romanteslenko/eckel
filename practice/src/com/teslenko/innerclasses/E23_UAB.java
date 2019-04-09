package com.teslenko.innerclasses;

interface U {
    void first();
    void second();
    void third();
}

class A {
    U createU() {
        return new U() {
            @Override
            public void first() {
                System.out.println("first");
            }
            @Override
            public void second() {
                System.out.println("second");
            }
            @Override
            public void third() {
                System.out.println("third");
            }
        };
    }
}

class B {
    private U[] us;
    private int i;
    B(int size) {
        us = new U[size];
    }
    boolean add(U u) {
        if (i < us.length) {
            us[i++] = u;
            while (i < us.length && us[i] != null) {
                i++;
            }
            return true;
        }
        return false;
    }
    void remove(int i) {
        if (i >= 0 && i < us.length && us[i] != null) {
            us[i] = null;
            this.i = i;
        }
    }
    void callAll() {
        for (U u : us) {
            if (u != null) {
                u.first();
                u.second();
                u.third();
            }
        }
    }
}

public class E23_UAB {
    public static void main(String[] args) {
        A[] as = new A[]{new A(), new A(), new A()};
        B b = new B(3);
        for (A a : as) {
            b.add(a.createU());
        }
        b.callAll();
        b.remove(1);
        b.callAll();
        b.add(new A().createU());
        b.callAll();
    }
}
