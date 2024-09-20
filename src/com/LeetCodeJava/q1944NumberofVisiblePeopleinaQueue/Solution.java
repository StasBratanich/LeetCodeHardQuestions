package com.LeetCodeJava.q1944NumberofVisiblePeopleinaQueue;

import java.util.Stack;

public class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[heights.length];

        for (int i = heights.length - 1; i >= 0; i--) {
            int visible = 0;

            while (!stack.isEmpty() && heights[i] > stack.peek()) {
                visible++;
                stack.pop();
            }

            if (!stack.empty()) {
                visible++;
            }

            result[i] = visible;
            stack.push(heights[i]);

        }

        return result;
    }
}
