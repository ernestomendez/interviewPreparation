package com.dxesoft.exercices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/3sum/
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 */
public class ThreeSumArray {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> triplets = new HashSet<>();

        if (nums.length <3) {
            return Collections.emptyList();
        }

        Map<Integer, Integer> remainder = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentTarget = - nums[i];

            if (nums.length - (i+1)  < 2) {
                return new ArrayList<>(triplets);
            }

            for (int j = i + 1; j < nums.length; j++) {
                int x= currentTarget - nums[j];

                if (remainder.containsKey(x)) {
                    if (remainder.get(x) > i && remainder.get(x) <j) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(x);
                        triplet.add(nums[j]);

                        Collections.sort(triplet);
                        triplets.add(triplet);
                    }
                } else {
                    remainder.put(nums[j], j);
                }
            }
        }

        return new ArrayList<>(triplets);
    }

    public List<Integer[]> findThreeSum(int[] nums, int target) {
        List<Integer[]> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int currentTarget = target - nums[i];
            Set<Integer> existingNums = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                if (existingNums.contains(currentTarget - nums[j])) {
                    result.add(new Integer[] { nums[i], nums[j], currentTarget - nums[j] });
                } else {
                    existingNums.add(nums[j]);
                }
            }
        }
        return result;
    }
}
