package com.teslenko.interfaces;

interface FastFood {
    void fastOrder();
    void quickClean();
}

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }

    @Override
    public String toString() {
        return "Bread";
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }

    @Override
    public String toString() {
        return "Cheese";
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }

    @Override
    public String toString() {
        return "Lettuce";
    }
}

class Pickle {
    Pickle() {
        System.out.println("Pickle()");
    }

    @Override
    public String toString() {
        return "Pickle";
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

class Sandwich extends PortableLunch implements FastFood {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();

    public Sandwich() {
        System.out.println("Sandwich()");
    }

    @Override
    public void fastOrder() {
        System.out.println("Making your sandwich with " + b + ", " + c + ", " + l + " and " + p + " super fast");
    }

    @Override
    public void quickClean() {
        System.out.println("Thank you for visit! We're going to clean super fast!");
    }
}

public class E08_FastFood {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        sandwich.fastOrder();
        sandwich.quickClean();
    }
}
