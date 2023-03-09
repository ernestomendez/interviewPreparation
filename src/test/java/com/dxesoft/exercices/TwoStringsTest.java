package com.dxesoft.exercices;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoStringsTest {

    @Test
    public void twoStrings() {

        TwoStrings twoStrings = new TwoStrings();

        String result = twoStrings.twoStrings("hello", "world");

        assertEquals("YES", result);
    }

    @Test
    public void twoStrings2() {

        TwoStrings twoStrings = new TwoStrings();

        String result = twoStrings.twoStrings("hi", "world");

        assertEquals("NO", result);
    }

    @Test
    public void twoStrings3() {

        TwoStrings twoStrings = new TwoStrings();

        String result = twoStrings.twoStringsWithSet("hi", "world");

        assertEquals("NO", result);
    }

    @Test
    public void twoStrings4() {

        TwoStrings twoStrings = new TwoStrings();

        String result = twoStrings.twoStringsWithSet("hello", "world");

        assertEquals("YES", result);
    }
//    jackandjill
//
//            wentupthehill

    @Test
    public void twoStrings5() {

        TwoStrings twoStrings = new TwoStrings();

        String result = twoStrings.twoStringsWithSet("hackerrankcommunity", "cdecdecdecde");

        assertEquals("YES", result);
    }

    @Test
    public void twoStrings6() {

        TwoStrings twoStrings = new TwoStrings();

        String result = twoStrings.twoStringsWithSet("wouldyoulikefries", "abcabcabcabcabcabc");

        assertEquals("NO", result);
    }

    @Test
    public void twoStrings7() {

        TwoStrings twoStrings = new TwoStrings();

        String result = twoStrings.twoStringsWithSet("beetroot", "sandals");

        assertEquals("NO", result);
    }
}