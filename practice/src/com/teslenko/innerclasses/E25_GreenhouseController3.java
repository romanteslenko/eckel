package com.teslenko.innerclasses;

import com.teslenko.innerclasses.controller.Event;
import com.teslenko.innerclasses.controller.GreenhouseControls2;

public class E25_GreenhouseController3 {
    public static void main(String[] args) {
        GreenhouseControls2 gc = new GreenhouseControls2();
        // Instead of hard-wiring, you could parse
        // configuration information from a text file here:
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new WindOn(1200),
                gc.new WindOff(1400),
                gc.new WaterMistGenOn(1600),
                gc.new WaterMistGenOff(1800),
                gc.new ThermostatDay(2000)
        };
        gc.addEvent(gc.new Restart(2200, eventList));
        if (args.length == 1)
            gc.addEvent(
                    new GreenhouseControls2.Terminate(
                            new Integer(args[0])));
        gc.run();
    }
}
