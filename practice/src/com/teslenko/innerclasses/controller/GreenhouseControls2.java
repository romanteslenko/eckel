package com.teslenko.innerclasses.controller;

public class GreenhouseControls2 extends GreenhouseControls {
    private boolean isWaterMistGenOn = false;

    public class WaterMistGenOn extends Event {

        public WaterMistGenOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            isWaterMistGenOn = true;
        }

        @Override
        public String toString() {
            return "Greenhouse water mist generator is on";
        }
    }

    public class WaterMistGenOff extends Event {

        public WaterMistGenOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            isWaterMistGenOn = false;
        }

        @Override
        public String toString() {
            return "Greenhouse water mist generator is off";
        }
    }
}
