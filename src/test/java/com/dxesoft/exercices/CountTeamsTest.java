package com.dxesoft.exercices;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CountTeamsTest {

    @Test
    public void countTeams() {

        CountTeams countTeams = new CountTeams();

        //4,4,8,5,6,1,5,7
        List<Integer> skills = Arrays.asList(4, 4, 8, 5, 6);

        final int teams = countTeams.countTeams(skills, 1, 5, 7);

        assertEquals(3, teams);
    }
}