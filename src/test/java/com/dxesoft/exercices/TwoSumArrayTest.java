package com.dxesoft.exercices;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TwoSumArrayTest {

    @Test
    public void twoSumArray() {

        TwoSumArray twoSumArray = new TwoSumArray();

        int[] nums = {2,7,11,15};
        int target = 9;

        int[] integers = twoSumArray.twoSumArray(nums, target);

        assertArrayEquals(new int[]{0,1}, integers);
    }

    @Test
    public void twoSumArray2() {

        TwoSumArray twoSumArray = new TwoSumArray();

        int[] nums = {3,2,4};
        int target = 6;

        int[] integers = twoSumArray.twoSumArray(nums, target);

        assertArrayEquals(new int[]{1, 2}, integers);
    }

    @Test
    public void twoSumArray3() {

        TwoSumArray twoSumArray = new TwoSumArray();

        int[] nums = {3,3};
        int target = 6;

        int[] integers = twoSumArray.twoSumArray(nums, target);

        assertArrayEquals(new int[]{0,1}, integers);
    }
}