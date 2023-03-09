package com.dxesoft.exercices;

public class ReverseInteger {

    public int reverseInteger(int number) {

        long reverse = 0;
        while (number != 0) {
            int d = number % 10;

            reverse = reverse * 10;
            reverse += d;

            if (reverse > Integer.MAX_VALUE) {
                return 0;
            }

            number = number/10;

        }

        return (int) reverse;
    }
}
