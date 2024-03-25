package com.example.wordcounter;

public class TextCounter {
    public static int getCharsCount(String phrase) {
        if (phrase == null) {
            return 0;
        }
        return phrase.replaceAll("\\s", "").length();
    }
    public static int getWordsCount(String phrase) {
        if (phrase == null) {
            return 0;
        }
        String[] words = phrase.split("\\s+|\\p{Punct}");
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}

