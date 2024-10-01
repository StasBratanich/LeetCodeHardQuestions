package com.LeetCodeJava.q239SlidingWindowMaximum;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();


        int[] nums1 = {1, 3, -1, -3, 5, 3, 6, 7};
        int k1 = 3;
        System.out.println("Input: nums = " + java.util.Arrays.toString(nums1) + ", k = " + k1);
        System.out.println("Output: " + solution.maxSlidingWindow(nums1, k1));

        int[] nums2 = {1};
        int k2 = 1;
        System.out.println("Input: nums = " + java.util.Arrays.toString(nums2) + ", k = " + k2);
        System.out.println("Output: " + solution.maxSlidingWindow(nums2, k2));
    }

}
