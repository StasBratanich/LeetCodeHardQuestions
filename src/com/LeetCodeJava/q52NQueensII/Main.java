package com.LeetCodeJava.q52NQueensII;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 4;
        int result = solution.totalNQueens(n);
        System.out.println("Number of solutions for n = " + n + ": " + result);
    }
}
