package com.teslenko.innerclasses;

interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

public class E14_HorrorShow {
    static void u(Monster b) { b.menace(); }
    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }
    static void w(Lethal l) { l.kill(); }
    public static void main(String[] args) {
        DangerousMonster barney = new DangerousMonster() {
            @Override
            public void destroy() {

            }
            @Override
            public void menace() {

            }
        };
        u(barney);
        v(barney);
        Vampire vlad = new Vampire() {
            @Override
            public void drinkBlood() {

            }
            @Override
            public void kill() {

            }
            @Override
            public void destroy() {

            }
            @Override
            public void menace() {
            }
        };
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
