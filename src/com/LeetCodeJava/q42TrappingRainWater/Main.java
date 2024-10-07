package com.LeetCodeJava.q42TrappingRainWater;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Trapped water for height1: " + solution.trap(height1)); // Expected output: 6

        // Example 2
        int[] height2 = {4, 2, 0, 3, 2, 5};
        System.out.println("Trapped water for height2: " + solution.trap(height2)); // Expected output: 9
    }
}
