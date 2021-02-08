package main.java.com.codewars.kata.solution.HighestScoringWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class HigestScoringWordTest {

    @Test
    public void sampleTests() {
        assertEquals("taxi", HighestScoringWord.high("man i need a taxi up to ubud"));
        assertEquals("volcano", HighestScoringWord.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", HighestScoringWord.high("take me to semynak"));
    }
}
