package com.dxesoft.exercices;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class FirstNonRepeatedChar {

    public int firstNonReapatedCharacter(String s) {

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            if (s.indexOf(letter) == s.lastIndexOf(letter)) {
                return i;
            }
        }
        return -1;
    }

    public int firstNonRepeatedCharacterMap(String s) {

        final int INVALID = -1;
        Map<Integer, Integer> count = new HashMap<>(s.length());

        for (int i = 0; i < s.length(); i++) {
            final int letter = s.charAt(i);
            if (count.containsKey(letter)) {
                count.put(letter, INVALID);
            } else {
                count.put(letter, i);
            }
        }

        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry: count.entrySet()) {
            if (entry.getValue() != INVALID) {
                min = Integer.min(min, entry.getValue());
            }
        }

        return min;
    }
}
