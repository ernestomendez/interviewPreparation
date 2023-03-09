package com.dxesoft.exercices;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {

    public String twoStrings(String s1, String s2) {

        for (Character c: s1.toCharArray()) {
                  if (s2.contains(c.toString())) {
                      return "YES";
                  }
        }

        return "NO";
    }

    public String twoStringMatch(String s1, String s2) {
        if (stringMatch(s1, s2)) {
            return "YES";
        }

        return "NO";
    }

    public boolean stringMatch(String s1, String s2) {
        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
        } else {
            int s1len = s1.length() -1;
            int s2len = s2.length() -1;

            String lastS1 = s1.substring(s1len);
            String lastS2 = s2.substring(s2len);
            if (lastS1.equals(lastS2)) {
                return true;
            } else {
                if (stringMatch(s1.substring(0, s1len), s2)) {
                    return true;
                } else {
                    return stringMatch(s1, s2.substring(0, s2len));
                }
            }
        }
    }

    public String twoStringsWithSet(String s1, String s2) {

        Set<Character> letters1= s1.chars()
                .mapToObj(e -> (char)e)
                .collect(Collectors.toSet());

        Set<Character> letters2 = s2.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toSet());

        for (Character character : letters2) {
            if (!letters1.add(character)) {
                return "YES";
            }
        }

        return "NO";
    }
}
