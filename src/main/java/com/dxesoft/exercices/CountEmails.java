package com.dxesoft.exercices;

import java.util.List;

public class CountEmails {

//    input = {1,1,0,0,1}
//    output = 4

    public int countEmails(List<Integer> emails) {

        int count = 0;

        final int start = getFirstNonRead(emails);

        if (start == emails.size() -1) {
            return count;
        }

        for (int i = start; i < emails.size(); i++) {
            if (emails.get(i) == 1) {
                count ++;
            } else {
                if (emails.get(i -1) == 1) {
                    count ++;
                }
            }
        }

        return count;
    }

    private int getFirstNonRead(List<Integer> emails) {
        for (int i = 0; i < emails.size(); i++) {
            if (emails.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }
}
