package com.dxesoft.exercices;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MaxSumTest {

    @Test
    public void findMaxSum() {
        List<Integer> list = Arrays.asList(5, 9, 7, 11);

        MaxSum maxSum = new MaxSum();

        final int res = maxSum.findMaxSum2(list);

        assertEquals(20, res);
    }

    @Test
    public void findMaxSum2() {
        List<Integer> list = Arrays.asList(5);

        MaxSum maxSum = new MaxSum();

        final int res = maxSum.findMaxSum2(list);

        assertEquals(5, res);
    }

    @Test
    public void findMaxSum3() {
        List<Integer> list = Arrays.asList(5, 8);

        MaxSum maxSum = new MaxSum();

        final int res = maxSum.findMaxSum2(list);

        assertEquals(13, res);
    }

    @Test
    public void maxSum() {
        List<Integer> list = Arrays.asList( 12, 34, 10, 6, 40);

        MaxSum maxSum = new MaxSum();

        final int res = maxSum.findMaxSum2(list);

        assertEquals(74, res);
    }

    @Test
    public void maxSum2() {
        List<Integer> list = Arrays.asList(9, 1);

        MaxSum maxSum = new MaxSum();

        final int res = maxSum.maxSum(list);

        assertEquals(10, res);
    }

    @Test
    public void maxSum3() {
        List<Integer> list = Arrays.asList(9);

        MaxSum maxSum = new MaxSum();

        final int res = maxSum.maxSum(list);

        assertEquals(9, res);
    }
}