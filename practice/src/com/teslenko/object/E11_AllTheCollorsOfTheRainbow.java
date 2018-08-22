package com.teslenko.object;

/**
 * Created by roman on 14.04.2018.
 */
public class E11_AllTheCollorsOfTheRainbow {
    int anIntegerRepresentColors;

    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentColors = newHue;
    }

    public static void main(String[] args) {
        E11_AllTheCollorsOfTheRainbow e11_allTheCollorsOfTheRainbow = new E11_AllTheCollorsOfTheRainbow();
        e11_allTheCollorsOfTheRainbow.changeTheHueOfTheColor(1);
        System.out.println(e11_allTheCollorsOfTheRainbow.anIntegerRepresentColors);
    }
}
