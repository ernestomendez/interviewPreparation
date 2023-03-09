package com.dxesoft.exercices;

public class LastAndSecondLast {

    public String lastLetters(String word) {
        int size = word.length();

        String result = "";
        for (int i = 1; i <= 2; i++) {
            result = result + word.charAt(size - i);
            result = result + " ";
        }

        return result.substring(0, size);

    }
}
