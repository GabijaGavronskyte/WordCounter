package com.example.wordcounter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Given_EmptyText_getCharsCount_ZeroReturned() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_EmptyText_getWordsCount_ZeroReturned() {
        TextCounter tc = new TextCounter();
        String givenString = "";
        int expectedValue = 0;
        int actualValue = tc.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_null_getCharsCount_ZeroReturned() {
        String givenString = null;
        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_null_getWordsCount_ZeroReturned() {
        TextCounter tc = new TextCounter();
        String givenString = null;
        int expectedValue = 0;
        int actualValue = tc.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_Space_getCharsCount_ZeroReturned() {
        String givenString = "  ";
        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_Space_getWordsCount_ZeroReturned() {
        TextCounter tc = new TextCounter();
        String givenString = "  ";
        int expectedValue = 0;
        int actualValue = tc.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_NormalText_getCharsCount_CountReturned() {
        String givenString = "Labas vakaras";
        int expectedValue = 12;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_NormalText_getWordsCount_CountReturned() {
        TextCounter tc = new TextCounter();
        String givenString = "Labas vakaras";
        int expectedValue = 2;
        int actualValue = tc.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_Equation_getCharsCount_CharsReturned() {
        String givenString = "2+2=4";
        int expectedValue = 5;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_Equation_getWordsCount_NumbersReturned() {
        TextCounter tc = new TextCounter();
        String givenString = "2+2=4";
        int expectedValue = 3;
        int actualValue = tc.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_OnlyComma_getCharsCount_CharsReturned() {
        String givenString = ",,, ,,,";
        int expectedValue = 6;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_OnlyComma_getWordsCount_ZeroReturned() {
        TextCounter tc = new TextCounter();
        String givenString = ",,, ,,,";
        int expectedValue = 0;
        int actualValue = tc.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);

    }
}