package com.teslenko.holding;

import java.util.*;
import com.teslenko.util.*;

public class E20_EachVowel {
    public static void main(String[] args) {
        String vowelsStr = "EeUuIiYyOoAa";
        Map<Character, Integer> vowels = new HashMap<Character, Integer>();
        for (char vowel : vowelsStr.toCharArray()) {
            vowels.put(vowel, 0);
        }
        for (String str :
                new TextFile("src\\com\\teslenko\\holding\\E20_EachVowel.java",
                        "\\W+")) {
            for (char letter : str.toCharArray()) {
                if (vowels.containsKey(letter)) {
                    vowels.put(letter, vowels.get(letter) + 1);
                }
            }
        }
        System.out.println(vowels);
    }
}
