package com.dxesoft.exercices;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CountEmailsTest {

    @Test
    public void countEmails() {


//    input = {1,1,0,0,1}
//    output = 4

        List<Integer> emails = Arrays.asList(1,1,0,0,1);

        CountEmails countEmails = new CountEmails();

        final int i = countEmails.countEmails(emails);

        assertEquals(4, i);
    }
}