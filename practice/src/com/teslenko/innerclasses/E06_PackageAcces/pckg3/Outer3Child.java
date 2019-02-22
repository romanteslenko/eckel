package com.teslenko.innerclasses.E06_PackageAcces.pckg3;

import com.teslenko.innerclasses.E06_PackageAcces.pckg1.IInner;
import com.teslenko.innerclasses.E06_PackageAcces.pckg2.Outer3;

public class Outer3Child extends Outer3 {
    public IInner getInnerIterface() {
        return (IInner) new Inner();
    }
}
