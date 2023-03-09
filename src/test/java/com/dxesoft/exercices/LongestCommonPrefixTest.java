package com.dxesoft.exercices;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

        String[] str = {"flower","flow","flight"};

        final String prefix = longestCommonPrefix.longestCommonPrefix(str);

        assertTrue("fl".equals(prefix));
    }

    @Test
    public void longestCommonPrefix2() {

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

        String[] str = {"dog","racecar","car"};

        final String prefix = longestCommonPrefix.longestCommonPrefix(str);

        assertTrue("".equals(prefix));
    }
}