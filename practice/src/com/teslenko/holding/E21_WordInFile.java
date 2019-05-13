package com.teslenko.holding;

import java.util.*;
import com.teslenko.util.*;

public class E21_WordInFile {
    public static void main(String[] args) {
        List<String> text = new TextFile(
                "src\\com\\teslenko\\holding\\E21_WordInFile.java", "\\W+");
        Map<String, Integer> words = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        for (String word : text) {
            int val = words.getOrDefault(word, 0);
            words.put(word, val + 1);
        }
        System.out.println(words);
    }
}
