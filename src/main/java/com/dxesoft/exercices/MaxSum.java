package com.dxesoft.exercices;

import java.util.Collections;
import java.util.List;

public class MaxSum {

    public int findMaxSum(List<Integer> list) {

        if (list.size() == 1) {
            return list.get(0);
        }

        Collections.sort(list);

        return list.get(list.size()-1) + list.get(list.size() -2);

    }

    public int maxSum(List<Integer> list) {
        int j = 0;
        int max = list.size() == 1 ? list.get(0) : list.get(0) + list.get(1);
        for (int i = 1; i < list.size(); i++) {
            int sum = list.get(j) + list.get(i);
            if (sum > max) {
                max = sum;
                if (list.get(j) < list.get(i)) {
                    j = i;
                }
            }
        }
        return max;

    }



    public int findMaxSum2(List<Integer> list) {

        if (list.size() == 1) {
            return list.get(0);
        }

        int n1;
        int n2;
        if (list.get(0) > list.get(1)) {
            n1 = list.get(0);
            n2 = list.get(1);
        } else {
            n1 = list.get(1);
            n2 = list.get(0);
        }

        for (int i = 2; i < list.size(); i++) {
            if (list.get(i) > n1) {
                n2 = n1;
                n1 = list.get(i);
            } else if (list.get(i) > n2) {
                n2 = list.get(i);
            }
        }

        return n1 + n2;


    }

}
