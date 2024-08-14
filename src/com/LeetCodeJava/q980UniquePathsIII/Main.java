package com.LeetCodeJava.q980UniquePathsIII;

public class Main {
    public static void main(String[] args) {
        int[][] grid1 = {
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 2, -1}
        };

        int[][] grid2 = {
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 2}
        };

        int[][] grid3 = {
                {0, 1},
                {2, 0}
        };

        Solution solution = new Solution();

        System.out.println("Number of unique paths in grid1: " + solution.uniquePathsIII(grid1)); // Output 2
        System.out.println("Number of unique paths in grid2: " + solution.uniquePathsIII(grid2)); // Output 4
        System.out.println("Number of unique paths in grid3: " + solution.uniquePathsIII(grid3)); // Output 0
    }
}
