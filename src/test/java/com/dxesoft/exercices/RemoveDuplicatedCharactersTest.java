package com.dxesoft.exercices;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatedCharactersTest {

    @Test
    public void transform() {

        String s = "abbcbbb";

        RemoveDuplicatedCharacters removeDuplicatedCharacters = new RemoveDuplicatedCharacters();

        final String res = removeDuplicatedCharacters.transform(s);

        assertEquals(res, "abcb");
    }

    @Test
    public void transform1() {

        String s = "abbcbbbccdddddddddda";

        RemoveDuplicatedCharacters removeDuplicatedCharacters = new RemoveDuplicatedCharacters();

        final String res = removeDuplicatedCharacters.transform(s);

        assertEquals(res, "abcbcda");
    }

    @Test
    public void transform3() {

        String s = "a";

        RemoveDuplicatedCharacters removeDuplicatedCharacters = new RemoveDuplicatedCharacters();

        final String res = removeDuplicatedCharacters.transform(s);

        assertEquals(res, "a");
    }

    @Test
    public void transform4() {

        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        RemoveDuplicatedCharacters removeDuplicatedCharacters = new RemoveDuplicatedCharacters();

        final String res = removeDuplicatedCharacters.transform(s);

        assertEquals(res, "a");
    }
}