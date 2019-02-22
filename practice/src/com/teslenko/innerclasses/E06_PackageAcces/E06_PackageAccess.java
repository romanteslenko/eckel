package com.teslenko.innerclasses.E06_PackageAcces;

import com.teslenko.innerclasses.E06_PackageAcces.pckg3.Outer3Child;

public class E06_PackageAccess {
    public static void main(String[] args) {
        new Outer3Child().getInnerIterface().f();
    }
}
