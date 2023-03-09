package com.dxesoft.exercices;

/**
 * https://leetcode.com/problems/minimum-size-subarray-sum/
 */
public class MinimumSizeSubArraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int lengthOfSmallestSubarray = Integer.MAX_VALUE;
        int actualSum = 0;

        int windowStart = 0;
        for(int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            actualSum += nums[windowEnd]; // Add the next element to the window

            while(actualSum >= target) { // Shrink the window as small as possible until the 'actualSum' is smaller than 'target'
                lengthOfSmallestSubarray = Math.min(lengthOfSmallestSubarray, windowEnd-windowStart+1);
                actualSum -= nums[windowStart]; // Discard the element at 'windowStart' since it is going out of the window
                windowStart++; // Shrink the window
            }
        }

        return lengthOfSmallestSubarray == Integer.MAX_VALUE ? 0 : lengthOfSmallestSubarray;
    }
}
