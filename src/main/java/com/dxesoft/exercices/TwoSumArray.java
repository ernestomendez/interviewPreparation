package com.dxesoft.exercices;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */
public class TwoSumArray {

    public int[] twoSumArray(int[] nums, int target) {
        int[] indexes = new int[2];
        Map<Integer, Integer> remanente = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];

            if (remanente.containsKey(x)) {
                indexes[0] = remanente.get(x);
                indexes[1] = i;
                break;
            } else {
                remanente.put(nums[i], i);
            }
        }
        return indexes;
    }
}
