package com.LeetCodeJava.q2392BuildaMatrixWithConditions;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        // Example 1
        int k1 = 3;
        int[][] rowConditions1 = {
                {1, 2},
                {3, 2}
        };
        int[][] colConditions1 = {
                {2, 1},
                {3, 2}
        };

        // Example 2
        int k2 = 3;
        int[][] rowConditions2 = {
                {1, 2},
                {2, 3},
                {3, 1},
                {2, 3}
        };
        int[][] colConditions2 = {
                {2, 1}
        };

        // Call your function with Example 1
        int[][] result1 = solution.buildMatrix(k1, rowConditions1, colConditions1);
        System.out.println("Example 1 Result:");
        printMatrix(result1);

        // Call your function with Example 2
        int[][] result2 = solution.buildMatrix(k2, rowConditions2, colConditions2);
        System.out.println("Example 2 Result:");
        printMatrix(result2);

    }

    public static void printMatrix ( int[][] matrix){
        if (matrix.length == 0) {
            System.out.println("[]");
            return;
        }
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
