package com.dxesoft.exercices;

import java.util.ArrayList;
import java.util.List;

public class TwoSortedArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;

        if (length < 3) {
            return shortSize(nums1, nums2, length);
        }

        final double half = Math.ceil(length / 2.0);
        int count = 0;

        boolean odd = length % 2 != 0;
        int i = 0, j = 0;
        int n1;
        if (nums1.length == 0) {
            n1 = nums2[1];
            j++;
        } else {
            n1 = nums1[0];
        }
        int n2;
        if (nums2.length == 0) {
            n2 = nums1[1];
            i++;
        } else {
            n2 = nums2[0];
        }

        List<Integer> r = new ArrayList<>();


        while (true) {
            if (n1 <= n2) {
                r.add(n1);
                count++;
                if (i < nums1.length - 1) {
                    i++;
                    n1 = nums1[i];
                } else if (j < nums2.length - 1){
                    j++;
                    n1 = nums2[j];
                }
            } else {
                r.add(n2);
                count++;
                if (j < nums2.length - 1) {
                    j++;
                    n2 = nums2[j];
                } else if (i < nums1.length - 1){
                    i ++;
                    n2 = nums1[i];
                }
            }

            if (count == half) {
                if (odd) {
                    return r.get(r.size() -1);
                } else {
                    int x = r.get(r.size() -1);

                    int y = Math.min(n1, n2);

                    return (x + y)/2.0;
                }
            }

        }
    }

    private double resultEven(int num1, int num2) {
        return (num1 + num2)/2.0;
    }

    private double shortSize(int[] nums1, int[] nums2, int totalLength) {
        if (totalLength == 1) {
            if (nums1.length == 0) {
                return nums2[0];
            } else {
                return nums1[0];
            }
        } else {
            if (nums1.length == 0) {
                return (nums2[0] + nums2[1]) / 2.0;
            } else if (nums2.length == 0) {
                return (nums1[0] + nums1[1]) / 2.0;
            } else {
                return (nums1[0] + nums2[0]) /2.0;
            }
        }
    }


}
