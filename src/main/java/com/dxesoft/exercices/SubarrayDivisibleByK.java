package com.dxesoft.exercices;

import java.util.Arrays;

public class SubarrayDivisibleByK {

    public int subarraysDivByK(int[] nums, int k) {

        int[] modules = new int[k];
        Arrays.fill(modules, 0);

        int currentSum = 0;
        for (int num : nums) {
            currentSum += num;

            final int currentModule = ((currentSum % k) + k) % k;

            modules[currentModule]++;
        }

        int result = modules[0];

        for (int i = 0; i < k; i++) {
            if (modules[i] > 1) {
                result += (modules[i] * (modules[i] - 1)) / 2;
            }
        }

        return result;

    }
}
