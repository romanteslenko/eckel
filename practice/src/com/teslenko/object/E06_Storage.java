package com.teslenko.object;

/**
 * Created by roman on 14.04.2018.
 */
public class E06_Storage {

    int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        E06_Storage e06_storage = new E06_Storage();
        System.out.println(e06_storage.storage("Hello, World!"));
    }
}