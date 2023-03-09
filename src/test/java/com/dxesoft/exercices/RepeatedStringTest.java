package com.dxesoft.exercices;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedStringTest {

    @Test
    public void repeatedString() {
        String s = "aba";
        int n = 10;

        RepeatedString repeatedString = new RepeatedString();

        long result = repeatedString.repeatedString(s, n);

        assertEquals(7, result);
    }

    @Test
    public void repeatedString1() {
        String s = "a";
        long n = 1000000000;

        RepeatedString repeatedString = new RepeatedString();

        long result = repeatedString.repeatedString(s, n);

        assertEquals(1000000000, result);
    }

    @Test
    public void repeatedString2() {
        String s = "abcdefag";
        long n = 4;

        RepeatedString repeatedString = new RepeatedString();

        long result = repeatedString.repeatedString(s, n);

        assertEquals(1, result);
    }


}