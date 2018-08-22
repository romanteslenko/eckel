package com.teslenko.reusing;

final class FinalClass {}

class ExtendedFromFinalClass /*extends FinalClass*/ {}

public class E22_FinalClass {
    public static void main(String[] args) {
        new ExtendedProtector();
    }
}
