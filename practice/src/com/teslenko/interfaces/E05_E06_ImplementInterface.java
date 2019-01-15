package com.teslenko.interfaces;

import com.teslenko.interfaces.internal.*;

public class E05_E06_ImplementInterface implements ITriada {

    @Override
    public void a() {
        System.out.println("A");
    }

    @Override
    public void b() {
        System.out.println("B");
    }

    public void c() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        ITriada triada = new E05_E06_ImplementInterface();
        triada.a();
        triada.b();
        triada.c();
    }
}
