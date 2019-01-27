package com.teslenko.interfaces;

interface IFisrst {
    void f1();
    void s1();
}

interface ISecond {
    void f2();
    void s2();
}

interface IThird {
    void f3();
    void s3();
}

interface IMultiple extends IFisrst, ISecond, IThird {
    void m();
}

abstract class Concrete { // abstract can be removed
    abstract void c();
}

class Target extends Concrete implements IFisrst, ISecond, IThird, IMultiple {
    @Override
    public void f1() {
        System.out.println("f1()");
    }

    @Override
    public void s1() {
        System.out.println("s1()");
    }

    @Override
    public void f2() {
        System.out.println("f2()");
    }

    @Override
    public void s2() {
        System.out.println("s2()");
    }

    @Override
    public void f3() {
        System.out.println("f3()");
    }

    @Override
    public void s3() {
        System.out.println("s3()");
    }

    @Override
    public void m() {
        System.out.println("m()");
    }

    @Override
    void c() {
        System.out.println("c()");
    }
}

public class E14_E15_InterfaceInheritance {
    static void f(IFisrst f) {
        f.f1();
        f.s1();
    }

    static void s(ISecond s) {
        s.f2();
        s.s2();
    }

    static void t(IThird t) {
        t.f3();
        t.s3();
    }

    static void m(IMultiple m) {
        m.m();
    }

    static void c(Concrete c) {
        c.c();
    }

    public static void main(String[] args) {
        Target target = new Target();
        f(target);
        s(target);
        t(target);
        m(target);
        c(target);
    }
}
