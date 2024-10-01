package com.LeetCodeJava.q239SlidingWindowMaximum;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> dequeue = new ArrayDeque<>();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!dequeue.isEmpty() && dequeue.peekFirst() == i - k) {
                dequeue.removeFirst();
            }

            while (!dequeue.isEmpty() && nums[dequeue.peekLast()] < nums[i]) {
                dequeue.removeLast();
            }

            dequeue.addLast(i);
            if (i >= k - 1) {
                list.addLast(nums[dequeue.peekFirst()]);
            }
        }

        System.out.print(list);
        System.out.println("");

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
