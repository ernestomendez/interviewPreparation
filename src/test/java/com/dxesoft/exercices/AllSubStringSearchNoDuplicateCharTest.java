package com.dxesoft.exercices;

import org.junit.Test;

import static org.junit.Assert.*;

public class AllSubStringSearchNoDuplicateCharTest {

    @Test
    public void findSubstrings() {

        String s = "abac";

        AllSubStringSearchNoDuplicateChar allSubStringSearchNoDuplicateChar = new AllSubStringSearchNoDuplicateChar();

        final int count = allSubStringSearchNoDuplicateChar.findSubstrings(s);

        assertEquals(8, count);
    }
}