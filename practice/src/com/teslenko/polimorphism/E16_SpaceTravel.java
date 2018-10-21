package com.teslenko.polimorphism;

class AlertStatus {
    void displayAlert() {
        System.out.println("Warning!");
    }
}

class LaunchStatus extends AlertStatus {
    @Override
    void displayAlert() {
        System.out.println("Ready to launch!");
    }
}

class LandingStatus extends AlertStatus {
    @Override
    void displayAlert() {
        System.out.println("Prepare for landing!");
    }
}

class ExploringStatus extends AlertStatus {
    @Override
    void displayAlert() {
        System.out.println("Be ready to leave the ship!");
    }
}

class Starship {
    AlertStatus status = new LaunchStatus();

    void travel() {
        status = new LandingStatus();
    }

    void land() {
        status = new ExploringStatus();
    }

    void checkStatus() {
        status.displayAlert();
    }
}

public class E16_SpaceTravel {
    public static void main(String[] args) {
        Starship starship = new Starship();
        starship.checkStatus();
        starship.travel();
        starship.checkStatus();
        starship.land();
        starship.checkStatus();
    }
}
