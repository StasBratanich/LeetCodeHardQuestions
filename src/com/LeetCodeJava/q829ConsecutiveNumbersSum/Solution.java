package com.LeetCodeJava.q829ConsecutiveNumbersSum;

public class Solution {
    public int consecutiveNumbersSum(int n) {
        int count = 0;

        for (int number = 1; number * (number - 1) / 2 < n; number++) {
            int sumRemaining = n - (number * (number - 1)) / 2;

            if (sumRemaining > 0 && sumRemaining % number == 0) {
                count++;
            }
        }

        return count;
    }
}
