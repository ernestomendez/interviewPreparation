package com.dxesoft.exercices;

public class MaxSumContiguous {

    public int maxsum(int [] numbers) {

        int max_sum = numbers[0];
        int current_sum = max_sum;

        for (int i = 1; i < numbers.length; i++) {
            current_sum = Math.max(current_sum + numbers[i], numbers[i]);

            max_sum = Math.max(current_sum, max_sum);
        }

        return max_sum;
    }
}
