package com.dxesoft.exercices;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedParenthesisTest {

    @Test
    public void isValid() {
        String expression = "{([])}";

        BalancedParenthesis cognizant = new BalancedParenthesis();

        final boolean valid = cognizant.isValid(expression);

        assertTrue(valid);
    }
}