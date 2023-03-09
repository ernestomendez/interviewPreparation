package com.dxesoft.exercices;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        int j = 0, length= 0;
        int max = 0;

        Set<Character> subStrings = new HashSet<>();

        for (int i = 0; i < s.length() ; i++) {
            if (i == j) {
                subStrings.add(s.charAt(i));
                length++;

            } else {
                char c = s.charAt(i);
                if (subStrings.contains(c)) {
                    do {
                        if (s.charAt(j) == c) {
                            j++;
                            break;
                        } else {
                            subStrings.remove(s.charAt(j));
                            j++;
                            length--;
                        }
                    } while (j<i);
                } else {
                    subStrings.add(c);
                    length++;
                }
            }
            if (length > max) {
                max = length;
            }
        }

        return max;
    }
}
