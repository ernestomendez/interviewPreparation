package com.dxesoft.exercices;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class JumpingOnCloudsTest {

    @Test
    public void jumpingOnClouds() {
        Integer c[] = {0,0,1,0,0,1,0};

        JumpingOnClouds jumpingOnClouds = new JumpingOnClouds();

        int jumps = jumpingOnClouds.jumpingOnClouds(Arrays.asList(c));

        assertEquals(4, jumps);
    }

    @Test
    public void jumpingOnClouds2() {
        Integer c[] = {0,0,0,0,1,0};

        JumpingOnClouds jumpingOnClouds = new JumpingOnClouds();

        int jumps = jumpingOnClouds.jumpingOnClouds(Arrays.asList(c));

        assertEquals(3, jumps);
    }

    @Test
    public void jumpingOnClouds3() {
        Integer c[] = {0,0,1};

        JumpingOnClouds jumpingOnClouds = new JumpingOnClouds();

        int jumps = jumpingOnClouds.jumpingOnClouds(Arrays.asList(c));

        assertEquals(1, jumps);
    }

    @Test
    public void jumpingOnClouds4() {
        Integer c[] = {0,0,1,1,0};

        JumpingOnClouds jumpingOnClouds = new JumpingOnClouds();

        int jumps = jumpingOnClouds.jumpingOnClouds(Arrays.asList(c));

        assertEquals(1, jumps);
    }
}