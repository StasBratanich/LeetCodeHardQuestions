package com.LeetCodeJava.q1402ReducingDishes;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] satisfaction1 = {-1, -8, 0, 5, -9};
        // Expected output: 14
        System.out.println("Example 1 Result: " + solution.maxSatisfaction(satisfaction1));

        // Example 2
        int[] satisfaction2 = {4, 3, 2};
        // Expected output: 20
        System.out.println("Example 2 Result: " + solution.maxSatisfaction(satisfaction2));

        // Example 3
        int[] satisfaction3 = {-1, -4, -5};
        // Expected output: 0
        System.out.println("Example 3 Result: " + solution.maxSatisfaction(satisfaction3));
    }
}
