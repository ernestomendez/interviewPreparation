package com.dxesoft.exercices;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrappingRainWatterTest {

    @Test
    public void trap() {

        TrappingRainWatter trappingRainWatter = new TrappingRainWatter();

        int [] x = {3,0,2};

        int r = trappingRainWatter.trap(x);

        assertEquals(2, r);
    }

    @Test
    public void trap1() {

        TrappingRainWatter trappingRainWatter = new TrappingRainWatter();

        int [] x = {3,0,2,0,4};

        int r = trappingRainWatter.trap(x);

        assertEquals(7, r);
    }


    @Test
    public void trap2() {
        TrappingRainWatter trappingRainWatter = new TrappingRainWatter();

        int [] x = {0,1,0,2,1,0,1,3,2,1,2,1};
        int r = trappingRainWatter.trap(x);

        assertEquals(6, r);
    }

    @Test
    public void trap3() {
        TrappingRainWatter trappingRainWatter = new TrappingRainWatter();

        int [] x = {6,4,2,0,3,2,0,3,1,4,5,3,2,7,5,3,0,1,2,1,3,4,6,8,1,3};
        int r = trappingRainWatter.trap(x);

        assertEquals(83, r);
    }



}