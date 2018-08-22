package com.teslenko.initialization;

public class E01_StringNonInit {
    private String str;

    public static void main(String[] args) {
        E01_StringNonInit dumb = new E01_StringNonInit();
        System.out.println(dumb.str);
    }
}
