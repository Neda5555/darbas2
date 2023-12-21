package com.example.darbas2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WordCharacterCounterTest {

    @Test
    public void countWords_NullInput_ReturnsZero() {
        assertEquals(0, WordCharacterCounter.countWords(null));
    }

    @Test
    public void countWords_EmptyInput_ReturnsZero() {
        assertEquals(0, WordCharacterCounter.countWords(""));
    }

    @Test
    public void countWords_SingleWord_ReturnsOne() {
        assertEquals(1, WordCharacterCounter.countWords("Hello"));
    }

    @Test
    public void countWords_MultipleWords_ReturnsCorrectCount() {
        assertEquals(4, WordCharacterCounter.countWords("This is a test"));
    }

    @Test
    public void countCharacters_NullInput_ReturnsZero() {
        assertEquals(0, WordCharacterCounter.countCharacters(null));
    }

    @Test
    public void countCharacters_EmptyInput_ReturnsZero() {
        assertEquals(0, WordCharacterCounter.countCharacters(""));
    }

    @Test
    public void countCharacters_InputWithCharacters_ReturnsCorrectCount() {
        assertEquals(11, WordCharacterCounter.countCharacters("Hello World"));
    }
}
