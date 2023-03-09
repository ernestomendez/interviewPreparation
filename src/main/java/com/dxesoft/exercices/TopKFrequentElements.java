package com.dxesoft.exercices;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 *
 * <a href="https://leetcode.com/problems/top-k-frequent-elements/">top k frequent element</a>
 */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frequenceTable = new HashMap<>();

        for (int num : nums) {
            if (frequenceTable.containsKey(num)) {
                int count = frequenceTable.get(num);
                frequenceTable.put(num, count + 1);
            } else {
                frequenceTable.put(num, 1);
            }
        }
        return nums;
    }
}
