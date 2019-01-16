package com.teslenko.interfaces;

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT; // Etc.
}

abstract class Instrument {
    void play(Note note) {
        System.out.println(this + " play " + note);
    }

    void adjust() {
        System.out.println(this + " adjust");
    }
}

class Wind extends Instrument {
    public String toString() { return "Wind"; }
}

class Percussion extends Instrument {
    public String toString() { return "Percussion"; }
}

class Stringed extends Instrument {
    public String toString() { return "Stringed"; }
}

class Brass extends Wind {
    public String toString() { return "Brass"; }
}

class Woodwind extends Wind {
    public String toString() { return "Woodwind"; }
}

public class E09_AbstractMusic {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] instruments) {
        for(Instrument instrument : instruments)
            tune(instrument);
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
