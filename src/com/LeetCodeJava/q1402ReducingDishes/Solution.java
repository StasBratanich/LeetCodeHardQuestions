package com.LeetCodeJava.q1402ReducingDishes;

import java.util.Arrays;

public class Solution {
    public int maxSatisfaction(int[] satisfaction) {

        int[] satisfactionSorted = satisfaction.clone();
        int maxSum = 0;
        Arrays.sort(satisfactionSorted);

        for (int i = 0; i < satisfactionSorted.length; i++) {
            int sum = 0;

            for (int j = i; j < satisfactionSorted.length; j++) {
                sum += satisfactionSorted[j] * (j - i + 1);
            }

            if (maxSum < sum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }
}
