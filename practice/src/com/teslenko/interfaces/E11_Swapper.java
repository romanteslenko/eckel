package com.teslenko.interfaces;

import com.teslenko.interfaces.interfaceprocessor.*;

public class E11_Swapper implements Processor {

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public Object process(Object input) {
        return swap((String)input);
    }

    private String swap(String input) {
        char[] arr = input.toCharArray();
        int len = input.length();
        if (len % 2 > 0)
        {
            len--;
        }
        for (int i = 0; i < len; i += 2) {
            char tmp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = tmp;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Apply.process(new E11_Swapper(), "Hello World");
    }
}
