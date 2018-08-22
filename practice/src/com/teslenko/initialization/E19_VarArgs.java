package com.teslenko.initialization;

public class E19_VarArgs {
    static void printVarArgs(String... strings) {
        if (0 == strings.length) {
            System.out.println("arguments list is empty");
        } else {
            for (String str : strings) {
                System.out.print(str + ' ');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printVarArgs("hello", "world", "java");
        printVarArgs(new String[]{"strings", "array"});
    }
}
