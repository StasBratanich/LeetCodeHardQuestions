package com.LeetCodeJava.q42TrappingRainWater;

public class Solution {
    public int trap(int[] height) {
        int sum = 0;

        int[] leftMaxArray = new int[height.length];
        int leftMax = height[0];
        leftMaxArray[0] = leftMax;

        for (int left = 1; left < height.length; left++) {
            leftMaxArray[left] = Math.max(leftMaxArray[left - 1], height[left]);
        }

        int[] rightMaxArray = new int[height.length];
        int rightMax = height[height.length - 1];
        rightMaxArray[height.length - 1] = rightMax;

        for (int right = height.length - 2; right >= 0; right--) {
            rightMaxArray[right] = Math.max(rightMaxArray[right + 1], height[right]);

        }

        for (int i = 0; i < height.length; i++) {
            int addVal = Math.min(leftMaxArray[i], rightMaxArray[i]);

            sum += Math.max(0, addVal - height[i]);
        }

        return sum;
    }
}
