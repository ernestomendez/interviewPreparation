package com.dxesoft.exercices;

import java.util.Arrays;

public class SubstringSearch {

    public boolean substringSearch(String text, String pattern) {
        final int[] lps = kmp(pattern);

        int textLength = text.length();
        int patternLength = pattern.length();

        int i = 0, j = 0;

        while (i < textLength) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                if (j == 0) {
                    i++;
                } else {
                    j = lps[j-1];
                }
            }

            if (j == patternLength -1 ) {
                return true;
            }
        }

        return false;
    }

    private int[] kmp(String pattern) {
        int len = 0;

        int[] lps = new int[pattern.length()];

        lps[0] = 0;
        int i = 1;

        while (i < pattern.length()){

            if (pattern.charAt(len) == pattern.charAt(i)) {
                lps[i] = len + 1;
                len++;
                i++;
            } else {
                if (len == 0) {
                    lps[i] = 0;
                    i++;
                } else {
                    len = lps[len - 1];
                }
            }
        }

        return lps;
    }
}
