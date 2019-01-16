package com.teslenko.interfaces;

interface Playable {
    void play(Note n); // Automatically public
}

interface Instrument2 {
    // Compile-time constant:
    int VALUE = 5; // static & final
    void adjust();
}

class Wind2 implements Instrument2, Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Wind"; }
    public void adjust() { System.out.println(this + ".adjust()"); }
}

class Percussion2 implements Instrument2, Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Percussion"; }
    public void adjust() { System.out.println(this + ".adjust()"); }
}

class Stringed2 implements Instrument2, Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Stringed"; }
    public void adjust() { System.out.println(this + ".adjust()"); }
}

class Brass2 extends Wind2 {
    public String toString() { return "Brass"; }
}

class Woodwind2 extends Wind2 {
    public String toString() { return "Woodwind"; }
}

public class E10_PlayableMusic {
    static void tune(Playable i) {
        i.play(Note.MIDDLE_C);
    }
    
    static void tuneAll(Playable[] e) {
        for(Playable i : e)
            tune(i);
    }
    
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Playable[] orchestra = {
                new Wind2(),
                new Percussion2(),
                new Stringed2(),
                new Brass2(),
                new Woodwind2()
        };
        
        tuneAll(orchestra);
    }
}
