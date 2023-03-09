package com.dxesoft.exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArithmeticMean {

    public int solution(int[] A, int S) {
        // write your code in Java SE 8

        int result = 0;
        int sum = 0;

        Map<Integer, Integer> averages = new HashMap<>();

        for (int j : A) {
            sum = sum + (j - S);

            if (sum == 0) {
                result++;
            }

            if (averages.containsKey(sum)) {
                result += averages.get(sum);
            } else {
                averages.put(sum, 1);
            }

        }

        return result;

    }

}
