package com.dxesoft.exercices;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen
 * There is a string, s, of lowercase English letters that is repeated infinitely many times.
 * Given an integer, n, find and print the number of letter a's in the first n letters of the infinite string.
 */
public class RepeatedString {

    public long repeatedString(String s, long n) {
        int length = s.length();

        long freq = aFrequency(s);
        long total = 0;

        if (length > n) {
            total = aFrequency(s.substring(0, (int) n));
        } else {
            long l = (n / length);
            int extras = (int) (n % length);

            total = freq * l;

            total = total +  aFrequency(s.substring(0, extras));
        }

        return total;
    }

    private long aFrequency(String s) {

        return s.chars().filter(ch -> ch == 'a').count();

    }

}
