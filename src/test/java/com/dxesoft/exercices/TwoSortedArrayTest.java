package com.dxesoft.exercices;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSortedArrayTest {

    @Test
    public void findMedianSortedArrays() {
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        TwoSortedArray twoSortedArray = new TwoSortedArray();

        final double medianSortedArrays = twoSortedArray.findMedianSortedArrays(nums1, nums2);

        assertEquals(2, medianSortedArrays);

    }

    @Test
    public void findMedianSortedArrays2() {
        int[] nums1 = {};
        int[] nums2 = {1,2,3,4};

        TwoSortedArray twoSortedArray = new TwoSortedArray();

        final double medianSortedArrays = twoSortedArray.findMedianSortedArrays(nums1, nums2);

        assertEquals(2.5, medianSortedArrays, 0);

    }
}