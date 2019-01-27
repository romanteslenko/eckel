package com.teslenko.interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class CharsGenerator {
    private static char[] allChars = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz".toCharArray();
    public static final int LENGTH = 10;
    private Random random = new Random();

    char[] generate() {
        char[] result = new char[LENGTH];
        for (int i = 0; i < result.length; i++) {
            result[i] = allChars[random.nextInt(allChars.length - 1)];
        }
        return result;
    }
}

public class E16_AdapterCharsGenerator extends CharsGenerator implements Readable {
    private int count = 10;
    private char[] buff;
    CharsGenerator cg;

    E16_AdapterCharsGenerator(int count) {
        this.count = count;
        cg = new CharsGenerator();
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        cb.put(cg.generate());
        return CharsGenerator.LENGTH;
    }

    public static void main(String[] args) {
        E16_AdapterCharsGenerator acg = new E16_AdapterCharsGenerator(3);
        Scanner scanner = new Scanner(acg);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
