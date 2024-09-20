package com.LeetCodeJava.q1944NumberofVisiblePeopleinaQueue;
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] heights1 = {10, 6, 8, 5, 11, 9};
        // Expected output: [3, 1, 2, 1, 1, 0]
        System.out.println("Example 1 Result: " + java.util.Arrays.toString(solution.canSeePersonsCount(heights1)));

        // Example 2
        int[] heights2 = {5, 1, 2, 3, 10};
        // Expected output: [4, 1, 1, 1, 0]
        System.out.println("Example 2 Result: " + java.util.Arrays.toString(solution.canSeePersonsCount(heights2)));

        // Example 3
        int[] heights3 = {2, 10, 3, 4, 8};
        // Expected output: [1, 3, 1, 1, 0]
        System.out.println("Example 3 Result: " + java.util.Arrays.toString(solution.canSeePersonsCount(heights3)));

        // Example 4
        int[] heights4 = {11,19,12,15,14,18,7,1,8,9};
        // Expected output: [1,5,1,2,1,3,2,1,1,0]
        System.out.println("Example 4 Result: " + java.util.Arrays.toString(solution.canSeePersonsCount(heights4)));
    }
}
