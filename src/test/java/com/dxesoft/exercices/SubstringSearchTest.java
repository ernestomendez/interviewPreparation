package com.dxesoft.exercices;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubstringSearchTest {

    @Test
    public void substringSearch() {
        SubstringSearch substringSearch = new SubstringSearch();

        String s = "abcdabcefghabcde";

        String p = "abcde";

        assertTrue(substringSearch.substringSearch(s, p));

    }

    @Test
    public void substringSearch2() {
        SubstringSearch substringSearch = new SubstringSearch();

        String s = "abcdabceabfghababcabd";

        String p = "abcabd";

        assertTrue(substringSearch.substringSearch(s, p));

    }

    @Test
    public void substringSearch3() {
        SubstringSearch substringSearch = new SubstringSearch();

        String s = "abcdabcefghabcab";

        String p = "abcab";

        assertTrue(substringSearch.substringSearch(s, p));

    }
}