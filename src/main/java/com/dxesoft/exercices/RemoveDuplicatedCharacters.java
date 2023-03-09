package com.dxesoft.exercices;

public class RemoveDuplicatedCharacters {

    public String transform(String input) {

        if (input.length() == 1) {
            return input;
        }

        char lastChar = input.charAt(0);
        StringBuilder sb = new StringBuilder(input.length());
        sb.append(lastChar);

        for (int i = 1; i < input.length(); i++) {
            if (lastChar != input.charAt(i)) {
                lastChar = input.charAt(i);
                sb.append(lastChar);
            }
        }

        return sb.toString();
    }
}
