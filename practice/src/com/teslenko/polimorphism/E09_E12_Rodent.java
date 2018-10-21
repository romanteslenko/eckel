package com.teslenko.polimorphism;

class Internal {
    private static int count = 0;
    private final int id = count++;
    int refs = 0;

    Internal() {
        System.out.println("Internal() " + id);
    }

    void dispose() {
        if (--refs == 0) {
            System.out.println("Internal " + id + " disposed");
        }
    }

    @Override
    public void finalize() {
        System.out.println("internal finalize");
        if (refs == 0) {
            System.out.println("Internal " + id + " correctly erased from memory");
        } else {
            System.out.println("Error erasing Internal " + id + " from memory");
        }
    }
}

class Rodent {
    private Internal internal;
    private Internal shared;

    Rodent(Internal shared) {
        System.out.println("Rodent()");
        this.internal = new Internal();
        this.internal.refs++;
        this.shared = shared;
        this.shared.refs++;
    }

    void eat() {
        System.out.println("Rodent eat");
    }

    void sleep() {
        System.out.println("Rodent sleep");
    }

    void run() {
        System.out.println("Rodent run");
    }

    void kill() {
        System.out.println("Rodent kill");
        shared.dispose();
        internal.dispose();
    }

    @Override
    public String toString() {
        return "Rodent";
    }
}

class Mouse extends Rodent {
    Internal internal;
    Internal shared;

    public Mouse(Internal shared) {
        super(shared);
        System.out.println("Mouse()");
        this.internal = new Internal();
        this.internal.refs++;
        this.shared = shared;
        this.shared.refs++;
    }

    @Override
    void eat() {
        System.out.println("Mouse eat");
    }

    @Override
    void sleep() {
        System.out.println("Mouse sleep");
    }

    @Override
    void run() {
        System.out.println("Mouse run");
    }

    @Override
    void kill() {
        System.out.println("Mouse kill");
        shared.dispose();
        internal.dispose();
        super.kill();
    }

    @Override
    public String toString() {
        return "Mouse";
    }
}

class Hamster extends Rodent {
    Internal internal;
    Internal shared;

    public Hamster(Internal shared) {
        super(shared);
        System.out.println("Hamster");
        this.internal = new Internal();
        internal.refs++;
        this.shared = shared;
        shared.refs++;
    }

    @Override
    void eat() {
        System.out.println("Hamster eat");
    }

    @Override
    void sleep() {
        System.out.println("Hamster sleep");
    }

    @Override
    void run() {
        System.out.println("Hamster run");
    }

    @Override
    void kill() {
        System.out.println("Hamster kill");
        shared.dispose();
        internal.dispose();
        super.kill();
    }

    @Override
    public String toString() {
        return "Hamster";
    }
}

public class E09_E12_Rodent {
    public static void main(String[] args) {
        Internal shared = new Internal();
        Rodent[] rodents = {new Mouse(shared), new Hamster(shared)};
        for (Rodent rodent : rodents) {
            rodent.sleep();
            rodent.run();
            rodent.eat();
            rodent.kill();
        }
        System.gc();
        System.runFinalization();
    }
}
