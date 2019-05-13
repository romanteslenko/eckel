package com.teslenko.holding;

import com.teslenko.util.TextFile;

import java.util.*;

public class E25_WordsPositions {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> words = new HashMap<>();
        int i = 0;
        for (String word : new TextFile(
                "src\\com\\teslenko\\holding\\E25_WordsPositions.java", "\\W+"
        )) {
            ArrayList<Integer> positions = words.getOrDefault(word, new ArrayList<>());
            positions.add(i++);
            words.put(word, positions);
        }
        System.out.println(words);
    }
}
