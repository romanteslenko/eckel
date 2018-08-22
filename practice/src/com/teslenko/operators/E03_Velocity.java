package com.teslenko.operators;

public class E03_Velocity {
    private static float calculateVelocity(float distance, float time) {
        time /= 60;
        return distance /= time;
    }

    public static void main(String[] args) {
        float distance = 50;
        float minutes = 30;
        System.out.println("velocity = " + calculateVelocity(distance, minutes) + " km/h");
    }
}
