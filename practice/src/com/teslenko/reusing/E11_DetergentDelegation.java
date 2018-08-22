package com.teslenko.reusing;

public class E11_DetergentDelegation {
    private Cleanser cleanser = new Cleanser();

    public void append(String s) {
        cleanser.append(s);
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void scrub() {
        append("Detergent.scrub");
        cleanser.scrub();
    }

    public void foam() {
        append("foam");
    }

    @Override
    public String toString() {
        return cleanser.toString();
    }

    public static void main(String[] args) {
        E11_DetergentDelegation detergent = new E11_DetergentDelegation();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        System.out.println(detergent);
    }
}
