package com.teslenko.polimorphism;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    Shared() {
        System.out.println("Creating " + this);
    }

    void addRef() { refcount++; }

    protected void dispose() {
        if(--refcount == 0)
            System.out.println("Disposing " + this);
    }

    @Override
    public void finalize() {
        if (refcount > 0) {
            System.out.println("Dispose error. Shared " + id + " still has " + refcount + " active references");
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}

public class E13_ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = { new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared) };
        for(Composing c : composing) {
            c.dispose();
            System.gc();
        }
        new Composing(new Shared());
        System.gc();
    }
}
