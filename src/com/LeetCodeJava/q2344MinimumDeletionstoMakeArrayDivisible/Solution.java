package com.LeetCodeJava.q2344MinimumDeletionstoMakeArrayDivisible;

import java.util.Arrays;

public class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {

        Arrays.sort(nums);
        int operations = 0;

        for (int i = 0; i < nums.length; i++) {

            if (isDivider(numsDivide, nums[i])) {
                return operations;
            }

            operations++;

            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
                operations++;
            }

        }
        return -1;
    }

    private boolean isDivider(int[] numsDivide, int num) {
        for (int i = 0; i < numsDivide.length; i++) {
            if (numsDivide[i] % num != 0) {
                return false;
            }
        }

        return true;
    }
}

