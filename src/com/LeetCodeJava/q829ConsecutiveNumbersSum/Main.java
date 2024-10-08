package com.LeetCodeJava.q829ConsecutiveNumbersSum;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int n1 = 5;
        int result1 = solution.consecutiveNumbersSum(n1);
        System.out.println("Number of ways for " + n1 + ": " + result1);

        int n2 = 9;
        int result2 = solution.consecutiveNumbersSum(n2);
        System.out.println("Number of ways for " + n2 + ": " + result2);

        int n3 = 15;
        int result3 = solution.consecutiveNumbersSum(n3);
        System.out.println("Number of ways for " + n3 + ": " + result3);
    }
}
