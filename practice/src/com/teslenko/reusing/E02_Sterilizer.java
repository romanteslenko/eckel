package com.teslenko.reusing;

class Cleanser {
    private String s = "Cleanser";

    public void append(String s) {
        this.s += " " + s;
    }

    public void dilute() {
        append("dilute");
    }

    public void apply() {
        append("apply");
    }

    public void scrub() {
        append("scrub");
    }

    @Override
    public String toString() {
        return s;
    }
}

class Detergent extends Cleanser {
    public void scrub() {
        append("Detergent.scrub()");
        super.scrub();
    }

    public void foam() {
        append("foam");
    }
}

public class E02_Sterilizer extends Detergent {
    public void scrub() {
        append("Sterilizer.scrub()");
        super.scrub();
    }

    public void sterilize() {
        append("sterilize");
    }

    public static void main(String[] args) {
        E02_Sterilizer sterilizer = new E02_Sterilizer();
        sterilizer.dilute();
        sterilizer.foam();
        sterilizer.scrub();
        sterilizer.sterilize();
        System.out.println(sterilizer.toString());
    }
}