package com.teslenko.polimorphism;

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph() before call draw()");
        draw();
        System.out.println("Glyph() after call draw()");
    }
}

class RoundedGlyph extends Glyph {
    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }

    private int radius = 5;

    RoundedGlyph(int radius) {
        this.radius = radius;
        System.out.println("RoundedGlyph(radius = " + this.radius + ')');
    }
}

class RectangularGlyph extends Glyph {
    private int width;
    private int height;

    @Override
    void draw() {
        System.out.println("RectangularGlyph().draw() {width=" + width + ", height=" + height + '}');
    }

    RectangularGlyph(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.println("RectangularGlyph(width=" + this.width + ", height=" + height + ')');
    }
}

public class E15_PolyConstructors {
    public static void main(String[] args) {
        new RoundedGlyph(5);
        new RectangularGlyph(2, 3);
    }
}
