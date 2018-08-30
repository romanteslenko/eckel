package com.teslenko.polimorphism;

import java.util.Random;

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT; // Etc.
}

class Instrument {
    void play(Note n) { System.out.println("Instrument.play() " + n); }
    @Override
    public String toString() { return "Instrument"; }
    void adjust() { System.out.println("Adjusting Instrument"); }
}

class Wind extends Instrument {
    void play(Note n) { System.out.println("Wind.play() " + n); }
    @Override
    public String toString() { return "Wind"; }
    void adjust() { System.out.println("Adjusting Wind"); }
}

class Percussion extends Instrument {
    void play(Note n) { System.out.println("Percussion.play() " + n); }
    @Override
    public String toString() { return "Percussion"; }
    void adjust() { System.out.println("Adjusting Percussion"); }
}

class Stringed extends Instrument {
    void play(Note n) { System.out.println("Stringed.play() " + n); }
    @Override
    public String toString() { return "Stringed"; }
    void adjust() { System.out.println("Adjusting Stringed"); }
}

class Brass extends Wind {
    void play(Note n) { System.out.println("Brass.play() " + n); }
    @Override
    public String toString() { return "Brass"; }
    void adjust() { System.out.println("Adjusting Brass"); }
}

class Woodwind extends Wind {
    void play(Note n) { System.out.println("Woodwind.play() " + n); }
    @Override
    public String toString() { return "Woodwind"; }
}

class Guitar extends Stringed {
    @Override
    void play(Note n) {
        System.out.println("Guitar.play() " + n);
    }

    @Override
    public String toString() {
        return "Guitar";
    }
}

class InstrumentGenerator {
    private Random random = new Random();

    Instrument next() {
        switch (random.nextInt(6)) {
            case 0:
                return new Wind();
            case 1:
                return new Stringed();
            case 2:
                return new Brass();
            case 3:
                return new Woodwind();
            case 4:
                return new Percussion();
            case 5:
                return new Guitar();
            default:
                return new Instrument();
        }
    }
}

public class E06_E07_E08_Music {
    static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        InstrumentGenerator instrumentGenerator = new InstrumentGenerator();
        Instrument[] orchestra = new Instrument[6];
        for (Instrument instrument : orchestra) {
            instrument = instrumentGenerator.next();
            System.out.println(instrument);
        }
//        tuneAll(orchestra);
    }
}
