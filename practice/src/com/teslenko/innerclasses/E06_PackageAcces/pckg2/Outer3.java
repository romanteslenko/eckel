package com.teslenko.innerclasses.E06_PackageAcces.pckg2;

import com.teslenko.innerclasses.E06_PackageAcces.pckg1.IInner;

public class Outer3 {
    protected class Inner implements IInner {
        public Inner() {}
        @Override
        public void f() {
            System.out.println("Inner.f()");
        }
    }
}
