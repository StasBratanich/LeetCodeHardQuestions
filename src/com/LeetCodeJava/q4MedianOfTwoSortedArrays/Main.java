package com.LeetCodeJava.q4MedianOfTwoSortedArrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1_1 = {1, 3};
        int[] nums2_1 = {2};
        // Expected output: 2.00000
        System.out.println("Example 1 Result: " + solution.findMedianSortedArrays(nums1_1, nums2_1));

        // Example 2
        int[] nums1_2 = {1, 2};
        int[] nums2_2 = {3, 4};
        // Expected output: 2.50000
        System.out.println("Example 2 Result: " + solution.findMedianSortedArrays(nums1_2, nums2_2));
    }
}
