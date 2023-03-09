package com.dxesoft.exercices;

/**
 * https://leetcode.com/problems/trapping-rain-water/
 */
public class TrappingRainWatter {

    public int trap(int[] height) {

        if (height.length < 3) {
            return 0;
        }

        int i=0, h=0, sum = 0;
        int j= height.length - 1;

        h = Math.min(height[i], height[j]);

        while (i < j) {
            if (height[i] <= height[j]) {
                i ++;
                if (height[i] < h) {
                    sum += h -height[i];
                } else {
                    h = Math.min(height[i], height[j]);
                }
            } else {
                j--;
                if (height[j] < h) {
                    sum += h - height[j];
                } else {
                    h = Math.min(height[i], height[j]);
                }
            }
        }
        return sum;
    }
}
