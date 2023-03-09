package com.dxesoft.exercices;

import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/max-array-sum/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dynamic-programming
 */
public class MaxArraySum {

    public int maxArraySum(int [] arr) {

        int length = arr.length;

        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return arr[0];
        }

        int [] sumas = new int[length];

        sumas[0] = Math.max(0, arr[0]);
        sumas[1] = Math.max(sumas[0], arr[1]);

        for (int i = 2; i < length; i++) {
            sumas[i] = Math.max(sumas[i-1], arr[i] + sumas[i-2]);
        }

        return sumas[length-1];

    }
}
