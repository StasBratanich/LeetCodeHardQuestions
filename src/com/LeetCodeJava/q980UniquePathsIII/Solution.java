package com.LeetCodeJava.q980UniquePathsIII;

public class Solution {
    public int uniquePathsIII(int[][] grid) {
        // Find starting point and count zeros
        int startRow = 0;
        int startColumn = 0;
        int countZeros = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    startRow = i;
                    startColumn = j;
                }
                if (grid[i][j] == 0) {
                    countZeros++;
                }
            }
        }

        return uniquePathsDFSRecursion(grid, startRow, startColumn, countZeros);
    }

    private int uniquePathsDFSRecursion(int[][] grid, int row, int column, int countZero) {
        // If out of grid bounds or a visited square return 0
        if(row < 0 || row >= grid.length || column < 0 || column >= grid[0].length || grid[row][column] == -1) {
            return 0;
        }
        // If landed on destination check if walked throw all zeros and + 1 to unique paths
        if(grid[row][column] == 2) {
            if(countZero == -1) {
                return 1;
            }

            return 0;
        }
        // Walk through 0, turn it to -1 and adjust countZeros
        grid[row][column] = -1;
        countZero--;

        // Check in recursion all 4 direction from the current square and return the sum of unique paths
        int uniquePaths = uniquePathsDFSRecursion(grid, row +1, column, countZero) +
                uniquePathsDFSRecursion(grid, row, column + 1, countZero) +
                uniquePathsDFSRecursion(grid, row - 1, column, countZero) +
                uniquePathsDFSRecursion(grid, row, column - 1, countZero);

        // Backtrack reset
        grid[row][column] = 0;
        countZero++;

        return uniquePaths;
    }
}
