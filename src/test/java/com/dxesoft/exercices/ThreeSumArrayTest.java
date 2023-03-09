package com.dxesoft.exercices;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ThreeSumArrayTest {

    @Test
    public void threeSum() {

        ThreeSumArray threeSumArray = new ThreeSumArray();

        int[] nums = {7, 12, 3, 1, 2, -6, 5, -8, 6};

        List<List<Integer>> triplets = threeSumArray.threeSum(nums);

        assertEquals(4, triplets.size());

        for (List<Integer> triplet : triplets) {
            for (Integer integer : triplet) {
                System.out.print(integer + " ");
            }
            System.out.println("");
        }
    }

    @Test
    public void threeSum2() {

        ThreeSumArray threeSumArray = new ThreeSumArray();

        int[] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> triplets = threeSumArray.threeSum(nums);

//        assertEquals(2, triplets.size());

        for (List<Integer> triplet : triplets) {
            for (Integer integer : triplet) {
                System.out.print(integer + " ");
            }
            System.out.println("");
        }
    }


    @Test
    public void threeSum3() {

        ThreeSumArray threeSumArray = new ThreeSumArray();

        int[] nums = {-1,0,1,2,-1,-4};

        List<Integer[]> triplets = threeSumArray.findThreeSum(nums, 0);

//        assertEquals(2, triplets.size());

        for (Integer[] triplet : triplets) {
            for (Integer integer : triplet) {
                System.out.print(integer + " ");
            }
            System.out.println("");
        }
    }


}