package com.teslenko.polimorphism;

import java.util.Random;

class Shape {
    void draw() {}

    void erase() {}

    void rotate() {
        System.out.println("Shape.rotate()");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    void rotate() {
        System.out.println("Circle.rotate()");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    void erase() {
        System.out.println("Triangle.erase()");
    }

    @Override
    void rotate() {
        System.out.println("Triangle.rotate()");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    void rotate() {
        System.out.println("Square.rotate()");
    }
}

class RandomShapeGenerator {
    private Random rand = new Random();

    public Shape next() {
        switch(rand.nextInt(4)) {
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            case 3:
                return new Line();
            default:
                return new Shape();
        }
    }
}

class Line extends Shape {
    @Override
    void draw() {
        System.out.println("Line.draw()");
    }

    @Override
    void erase() {
        System.out.println("Line.erase()");
    }

    @Override
    void rotate() {
        System.out.println("Line.rotate()");
    }
}

public class E02_E03_E04_Shapes {
    public static void main(String[] args) {
        RandomShapeGenerator shapeGenerator = new RandomShapeGenerator();
        Shape[] shapes = new Shape[9];
        for (Shape shape : shapes) {
            shape = shapeGenerator.next();
            shape.draw();
            shape.rotate();
        }
    }
}
