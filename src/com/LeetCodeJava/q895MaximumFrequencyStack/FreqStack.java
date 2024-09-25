package com.LeetCodeJava.q895MaximumFrequencyStack;

import java.util.*;

public class FreqStack {
    int maxFreq;
    HashMap<Integer, Integer> freqMap;
    HashMap<Integer, Stack<Integer>> freqStack;

    public FreqStack() {
        maxFreq = 0;
        freqMap = new HashMap<>();
        freqStack = new HashMap<>();
    }

    public void push(int val) {
        int freq = freqMap.getOrDefault(val,0) + 1;
        freqMap.put(val, freq);

        if (freq > maxFreq) {
            maxFreq = freq;
        }

        freqStack.computeIfAbsent(freq, f->new Stack()).push(val);

    }

    public int pop() {
        Stack<Integer> temp = freqStack.get(maxFreq);
        int topVal = temp.pop();

        if (temp.isEmpty()) {
            maxFreq--;
        }

        freqMap.put(topVal, freqMap.get(topVal) - 1);

        return topVal;
    }
}
