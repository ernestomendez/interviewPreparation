package com.dxesoft.exercices;

import com.dxesoft.exercices.TwoNumbers.ListNode;

/**
 * Add two numbers
 *
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sumando1 = 0;
        int sumando2 = 0;
        int remanente = 0;
        int sum = 0;

        ListNode head = null;
        ListNode tail = null;

        do {
            sumando1 = l1 != null ? l1.val : 0;
            sumando2 = l2 != null ? l2.val : 0;

            sum = sumando1 + sumando2 + remanente;

            if (sum > 9) {
                remanente = sum / 10;
                sum = sum % 10;
            } else {
                remanente = 0;
            }

            if (head == null) {
                head = new ListNode(sum);
                tail = head;
            } else {
                tail.next = new ListNode(sum);
                tail = tail.next;
            }

            if (null != l1) {
                l1 = l1.next;
            }
            if (null != l2) {
                l2 = l2.next;
            }
        } while (l1 != null || l2 != null || remanente > 0);

        return head;
    }
}
