package com.LeetCodeJava.q41FirstMissingPositive;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {1, 2, 0};
        // Expected output: 3
        System.out.println("Example 1 Result: " + solution.firstMissingPositive(nums1));

        // Example 2
        int[] nums2 = {3, 4, -1, 1};
        // Expected output: 2
        System.out.println("Example 2 Result: " + solution.firstMissingPositive(nums2));

        // Example 3
        int[] nums3 = {7, 8, 9, 11, 12};
        // Expected output: 1
        System.out.println("Example 3 Result: " + solution.firstMissingPositive(nums3));

        // Example 4
        int[] nums4 = {1};
        // Expected output: 2
        System.out.println("Example 4 Result: " + solution.firstMissingPositive(nums4));
    }
}
