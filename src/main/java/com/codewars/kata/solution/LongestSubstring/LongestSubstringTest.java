package main.java.com.codewars.kata.solution.LongestSubstring;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringTest {

    @Test
    public void abcabcbbReturns3() {
        assertEquals(3,LongestSubstring.lengthOfLongestSubstring("abcabcbb"));
    }
    @Test
    public void longestSubstringTestCases() {
        //assertEquals(1,LongestSubstring.lengthOfLongestSubstring("bbbbbbb"));
        assertEquals(3,LongestSubstring.lengthOfLongestSubstring("pwwkew"));
        //assertEquals(0,LongestSubstring.lengthOfLongestSubstring(""));
    }

}
