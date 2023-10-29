package com.example.darbas2;

public class WordCharacterCounter {
    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] words = text.split("\\s+"); // Skaidome tekstą į žodžius pagal tarpus ir kitus baltus simbolius
        return words.length;
    }

    public static int countCharacters(String text) {
        if (text == null) {
            return 0;
        }

        return text.length();
    }
}