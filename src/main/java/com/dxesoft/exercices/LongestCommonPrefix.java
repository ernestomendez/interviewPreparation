package com.dxesoft.exercices;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        StringBuilder prefix = new StringBuilder("");

        int pos = 0;
        boolean isEqual = false;

        char letter = 0;

        while (true) {
            if (strs[0].length() > pos) {
                letter = strs[0].charAt(pos);
            } else {
                return prefix.toString();
            }

            for (String str : strs) {
                if (str.length() > pos &&
                        letter == str.charAt(pos)) {
                    isEqual = true;
                } else {
                    isEqual = false;
                    break;
                }
            }
            if (!isEqual) {
                return prefix.toString();
            } else {
                prefix.append(letter);
            }
            pos ++;
        }

    }
}
