package com.teslenko.holding;

import java.util.*;

class Gerbil {
    private int gebrilNumber;
    Gerbil(int number) {
        gebrilNumber = number;
    }
    void hop() {
        System.out.println("Gerbil #" + gebrilNumber + " hops");
    }
}

public class E01_Gerbil {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil(i));
            gerbils.get(i).hop();
        }
    }
}
