package com.teslenko.reusing;

public class E12_Dispose {
    public static void main(String[] args) {
        Stem stem = new Stem();
        try {
            // Do nothing
        } finally {
            stem.dispose();
        }
    }
}
