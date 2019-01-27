package com.teslenko.interfaces;

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

interface CanClimb {
    void climb();
}

class ActionCharacter {
    public void fight() {
    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {
    public void swim() {
    }
    public void fly() {
    }
    public void climb() {

    }
}


public class E12_Adventure {
    private static void t(CanFight x) { x.fight(); }
    private static void u(CanSwim x) { x.swim(); }
    private static void v(CanFly x) { x.fly(); }
    private static void w(ActionCharacter x) { x.fight(); }
    private static void c(CanClimb x) { x.climb(); }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h); // Treat it as a CanFight
        u(h); // Treat it as a CanSwim
        v(h); // Treat it as a CanFly
        w(h); // Treat it as an ActionCharacter
        c(h); // Treat it as an CanClimb
    }
}
