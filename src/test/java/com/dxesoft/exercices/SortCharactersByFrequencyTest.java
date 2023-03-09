package com.dxesoft.exercices;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortCharactersByFrequencyTest {

    @Test
    public void frequencySort() {

        SortCharactersByFrequency sortCharactersByFrequency = new SortCharactersByFrequency();

        String s = sortCharactersByFrequency.frequencySort("tree");

        assertEquals("eert", s);
    }

    @Test
    public void frequencySort2() {

        SortCharactersByFrequency sortCharactersByFrequency = new SortCharactersByFrequency();

        String s = sortCharactersByFrequency.frequencySort("Aabb");

        assertEquals("bbAa", s);
    }
}