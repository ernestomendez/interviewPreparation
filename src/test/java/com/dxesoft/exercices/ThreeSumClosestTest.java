package com.dxesoft.exercices;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeSumClosestTest {

    @Test
    public void threeSumClosest() {
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();

        int [] nums = {-1,2,1,-4};

        int result = threeSumClosest.threeSumClosest(nums, 1);

        assertEquals(2, result);
    }

    @Test
    public void threeSumClosest2() {
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();

        int [] nums = {0,0,0};

        int result = threeSumClosest.threeSumClosest(nums, 1);

        assertEquals(0, result);
    }

    @Test
    public void threeSumClosest3() {
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();

        int [] nums = {1,1,-1,-1,3};

        int result = threeSumClosest.threeSumClosest(nums, -1);

        assertEquals(-1, result);
    }
}