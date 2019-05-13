package com.teslenko.holding;

import java.util.*;
import com.teslenko.util.*;

class Word {
    private final String word;
    private int counter;
    Word(String word) {
        this.word = word;
        counter = 1;
    }
    void increment() {
        counter++;
    }
    @Override
    public String toString() {
        return word + '=' + counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word1 = (Word) o;
        return word.equals(word1.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }
}

public class E22_SetWordsInFile {
    public static void main(String[] args) {
        Set<Word> words = new HashSet<>();
        List<String> text = new TextFile(
                "src\\com\\teslenko\\holding\\E22_SetWordsInFile", "\\W+");
        for (String str : text) {
            Word word = new Word(str);
            if (words.contains(word)) {
                words.remove(word);
            }
        }
    }
}
