package com.teslenko.initialization;

public class E11_MandatoryFinalize {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize");
    }

    public static void main(String[] args) {
        new E11_MandatoryFinalize();
        System.gc();
        System.runFinalization();
    }
}
