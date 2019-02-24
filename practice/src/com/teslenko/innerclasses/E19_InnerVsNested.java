package com.teslenko.innerclasses;

class Outer12 {
    class Inner {
        class InnerInner {}
    }
}

class Outer13 {
    static class Inner {
        static class InnerInner {}
    }
}

public class E19_InnerVsNested {
    public static void main(String[] args) {
        new Outer12().new Inner();
        new Outer12().new Inner().new InnerInner();
        new Outer13.Inner();
        new Outer13.Inner.InnerInner();
    }
}
