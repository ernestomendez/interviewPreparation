package com.dxesoft.exercices;

import org.junit.Test;

import static org.junit.Assert.*;

public class DetectCapitalTest {

    @Test
    public void detectCapitalUse() {

        DetectCapital detectCapital = new DetectCapital();


        final boolean res = detectCapital.detectCapitalUse("AbCd");

        assertFalse(res);
    }

    @Test
    public void detectCapitalUse2() {

        DetectCapital detectCapital = new DetectCapital();


        final boolean res = detectCapital.detectCapitalUse("asdklfjalsdkfjlasdkj");

        assertTrue(res);
    }

    @Test
    public void detectCapitalUse3() {

        DetectCapital detectCapital = new DetectCapital();


        final boolean res = detectCapital.detectCapitalUse("ETETEREH");

        assertTrue(res);
    }
}