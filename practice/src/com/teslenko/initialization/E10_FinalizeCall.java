package com.teslenko.initialization;

public class E10_FinalizeCall {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize");
    }

    public static void main(String[] args) {
        new E10_FinalizeCall();
    }
}
