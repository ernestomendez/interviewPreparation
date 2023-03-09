package com.dxesoft.exercices;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class JumpingOnClouds {

    int jumpingOnClouds(List<Integer> c) {

        int count = 0;
        int limit = c.size();

        for (int i = 0; i < limit; i++) {
            if ((i + 2) < limit && c.get(i + 2) == 0) {
                count++;
                i++;
            } else if((i +1) < limit && c.get(i + 1) == 0) {
                count++;
            } else {
                return count;
            }
        }
        return count;
    }
}
