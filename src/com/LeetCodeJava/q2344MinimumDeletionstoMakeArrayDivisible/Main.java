package com.LeetCodeJava.q2344MinimumDeletionstoMakeArrayDivisible;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {2, 3, 2, 4, 3};
        int[] numsDivide1 = {9, 6, 9, 3, 15};
        System.out.println(solution.minOperations(nums1, numsDivide1)); // Expected Output: 2

        // Test case 2
        int[] nums2 = {4, 3, 6};
        int[] numsDivide2 = {8, 2, 6, 10};
        System.out.println(solution.minOperations(nums2, numsDivide2)); // Expected Output: -1

        int[] nums = {3, 2, 6, 2, 35, 5, 35, 2, 5, 8, 7, 3, 4};
        int[] numsDivide = {105, 70, 70, 175, 105, 105, 105};

        System.out.println(solution.minOperations(nums, numsDivide)); // Expected Output: 6
    }
}
