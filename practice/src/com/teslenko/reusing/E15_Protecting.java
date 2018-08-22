package com.teslenko.reusing;

class BaseProtector {
    protected void protect() {
        System.out.println("protected in BaseProtector");
    }
}

class ExtendedProtector extends BaseProtector {
    void guard() {
        System.out.println("guard in ExtendedProtector");
        super.protect();
    }
}

public class E15_Protecting {
    public static void main(String[] args) {
        new ExtendedProtector().guard();
    }
}
