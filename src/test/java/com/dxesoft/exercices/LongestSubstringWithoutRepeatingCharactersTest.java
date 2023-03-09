package com.dxesoft.exercices;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void lengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters
                longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

        String s = "abcabcbb";

        int l = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        assertEquals(3, l);
    }

    @Test
    public void lengthOfLongestSubstring1() {
        LongestSubstringWithoutRepeatingCharacters
                longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

        String s = "bbbbb";

        int l = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        assertEquals(1, l);
    }

    @Test
    public void lengthOfLongestSubstring2() {
        LongestSubstringWithoutRepeatingCharacters
                longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

        String s = "";

        int l = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        assertEquals(0, l);
    }

    @Test
    public void lengthOfLongestSubstring3() {
        LongestSubstringWithoutRepeatingCharacters
                longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

        String s = "aab";

        int l = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        assertEquals(2, l);
    }

    @Test
    public void lengthOfLongestSubstring4() {
        LongestSubstringWithoutRepeatingCharacters
                longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

        String s = "anitalavalatina";

        int l = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        assertEquals(5, l);
    }
}