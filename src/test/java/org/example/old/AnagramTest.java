package org.example.old;

import junit.framework.TestCase;
import org.example.old.Anagram;
import org.junit.Test;

public class AnagramTest extends TestCase {

    @Test
    public void testExamination() {
        String firstWordToTest = "Anagram";
        String secondWordToTest = "aaNArgm";
        String thirdWordToTest = "abagram";
        int firstValueExpected = 1;
        int secondValueExpected = -1;
        int thirdValueExpected = -1;
        assertEquals(firstValueExpected, Anagram.examination(firstWordToTest, secondWordToTest));
        assertEquals(secondValueExpected, Anagram.examination(firstWordToTest, thirdWordToTest));
        assertEquals(thirdValueExpected, Anagram.examination(thirdWordToTest, secondWordToTest));
    }

    public void testTestExamination() {
    }
}