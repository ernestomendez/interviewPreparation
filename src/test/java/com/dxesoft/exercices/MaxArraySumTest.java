package com.dxesoft.exercices;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxArraySumTest {

    @Test
    public void maxArraySum() {

        MaxArraySum maxArraySum = new MaxArraySum();

        int [] arr = {2, 1, 5, 8, 4};
        int total = maxArraySum.maxArraySum(arr);

        assertEquals(11, total);
    }

    @Test
    public void maxArraySum2() {

        MaxArraySum maxArraySum = new MaxArraySum();

        int [] arr = {3, 5, -7, 8, 10};
        int total = maxArraySum.maxArraySum(arr);

        assertEquals(15, total);
    }
}