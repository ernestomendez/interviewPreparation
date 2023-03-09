package com.dxesoft.exercices;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/3sum-closest/
 *
 * Given an array nums of n integers and an integer target,
 * find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers.
 * You may assume that each input would have exactly one solution.
 */
public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int mindiff = Integer.MAX_VALUE;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k ) {
                int sum = nums[i] + nums[j] + nums[k];
                int difference = Math.abs(sum - target);

                if (difference == 0) {
                    return sum;
                }

                if (difference < mindiff ) {
                    mindiff = difference;
                    result = sum;
                }

                if (sum <= target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return result;
    }
}
