package com.LeetCodeJava.q4MedianOfTwoSortedArrays;

import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combined = new int[nums1.length + nums2.length];
        int i = 0;

        while (i < combined.length) {

            for (int j = 0; j < nums1.length; j++) {
                combined[i] = nums1[j];
                i++;
            }

            for (int k = 0; k < nums2.length; k++) {
                combined[i] = nums2[k];
                i++;
            }
        }

        Arrays.sort(combined);

        for (int j = 0; j < combined.length; j++) {
            System.out.print(combined[j] + ", ");
        }

        if (combined.length % 2 != 0) {
            return combined[combined.length / 2];
        } else {
            return (double)(combined[combined.length / 2] + combined[(combined.length / 2) - 1]) / 2;
        }
    }
}
