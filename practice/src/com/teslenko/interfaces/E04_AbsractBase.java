package com.teslenko.interfaces;

abstract class Base {
    abstract void foo();
}

class Derived extends Base {
    void foo() {
        System.out.println("Derived.f()");
    }
}

public class E04_AbsractBase {
    static void bar(Base instance) {
        //((Derived)instance).foo();  // Downcasting need only for methods that extends base class interface
        instance.foo();
    }

    public static void main(String[] args) {
        Derived d = new Derived();
        bar(d);
    }
}
