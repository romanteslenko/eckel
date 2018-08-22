package com.teslenko.reusing;

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}

public class E06_Chess extends BoardGame {
    E06_Chess() {
        super(1);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        new E06_Chess();
    }
}
