package com.dxesoft.exercices;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonSubsequenceTest {

    @Test
    public void recursive() {

        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();

        String text1 = "abcde", text2 = "ace";

        int i = longestCommonSubsequence.recursive(text1, text2);

        assertEquals(3, i);
    }
}