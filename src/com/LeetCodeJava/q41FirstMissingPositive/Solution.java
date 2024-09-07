package com.LeetCodeJava.q41FirstMissingPositive;

import java.util.*;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int val = 1;

        for (int i = 0; i < nums.length; i ++) {
            map.put(nums[i], i + 1);
        }

        for (val = 1; val <= map.size(); val++) {
            if (!map.containsKey(val)) {
                return val;
            }
        }

        return val;
    }
}
