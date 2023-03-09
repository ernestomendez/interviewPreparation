package com.dxesoft.exercices;

import java.util.List;

public class BalancedSum {

    public int balancedSum(List<Integer> arr) {
//        int count = 0;
        int i = 0;
        int j = arr.size() - 1;
        int sumLeft = arr.get(0);
        int sumRight = arr.get(arr.size() - 1);

        while (i <= j) {
            if (sumLeft == sumRight) {
                if (i == j) {
                    return i;
                }
            }
            if (sumLeft <= sumRight) {
                i++;
                Integer left = arr.get(i);
                sumLeft = sumLeft + left;
            } else {
                j--;
                Integer right = arr.get(j);
                sumRight += right;
            }
        }

        return 0;
    }

    public int balancedSum(int[] arr) {
//        int count = 0;
        int i = 1;
        int j = arr.length - 2;
        int sumLeft = arr[0];
        int sumRight = arr[arr.length - 1];

        while (i <= j) {
            if (sumLeft == sumRight) {
                if (i == j) {
                    return i;
                }
            }
            if (sumLeft <= sumRight) {
                int left = arr[i];
                sumLeft = sumLeft + left;
                i++;
            } else {
                int right = arr[j];
                sumRight += right;
                j--;
            }
        }

        return 0;
    }
}
