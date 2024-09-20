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

//        // Call your function with Example 1
//        int[][] result1 = solution.buildMatrix(k1, rowConditions1, colConditions1);
//        System.out.println("Example 1 Result:");
//        printMatrix(result1);
//
//        // Call your function with Example 2
//        int[][] result2 = solution.buildMatrix(k2, rowConditions2, colConditions2);
//        System.out.println("Example 2 Result:");
//        printMatrix(result2);

        // Example 3
        int k3 = 8;
        int[][] rowConditions3 = {
                {1, 2}, {7, 3}, {4, 3}, {5, 8}, {7, 8}, {8, 2},
                {5, 8}, {3, 2}, {1, 3}, {7, 6}, {4, 3}, {7, 4},
                {4, 8}, {7, 3}, {7, 5}
        };
        int[][] colConditions3 = {
                {5, 7}, {2, 7}, {4, 3}, {6, 7}, {4, 3}, {2, 3}, {6, 2}
        };

        // Call your function with Example 3
        int[][] result3 = solution.buildMatrix(k3, rowConditions3, colConditions3);
        System.out.println("Example 3 Result:");
        printMatrix(result3);


        System.out.print("[\n[0,0,0,0,0,0,7,0],\n" +
                        "[0,6,0,0,0,0,0,0],\n" +
                        "[0,0,5,0,0,0,0,0],\n" +
                        "[0,0,0,4,0,0,0,0],\n" +
                        "[8,0,0,0,0,0,0,0],\n" +
                        "[0,0,0,0,0,0,0,1],\n" +
                        "[0,0,0,0,0,3,0,0],\n" +
                        "[0,0,0,0,2,0,0,0]\n]"
        );


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
