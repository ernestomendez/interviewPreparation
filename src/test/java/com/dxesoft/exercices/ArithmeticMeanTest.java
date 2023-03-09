package com.dxesoft.exercices;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticMeanTest {

    @Test
    public void solution() {
        ArithmeticMean arithmeticMean = new ArithmeticMean();

        int[] A = {0, 4, 3, -1};

        int s = 2;

        final int solution = arithmeticMean.solution(A, s);

        assertEquals(2, solution);
    }

    @Test
    public void solution2() {
        ArithmeticMean arithmeticMean = new ArithmeticMean();

        int[] A = {2, 1, 3};

        int s = 2;

        final int solution = arithmeticMean.solution(A, s);

        assertEquals(3, solution);
    }

    @Test
    public void solution3() {
        ArithmeticMean arithmeticMean = new ArithmeticMean();

        int[] A = {2, 1, 4};

        int s = 3;

        final int solution = arithmeticMean.solution(A, s);

        assertEquals(0, solution);
    }

}