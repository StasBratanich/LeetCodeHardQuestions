package com.LeetCodeJava.q895MaximumFrequencyStack;

public class Main {
    public static void main(String[] args) {
        // Instantiate the FreqStack
        FreqStack freqStack = new FreqStack();

        // Perform push operations as per example 1
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(4);
        freqStack.push(5);

        // Perform pop operations and print the results
        System.out.println("Pop Result 1: " + freqStack.pop());  // Expected output: 5
        System.out.println("Pop Result 2: " + freqStack.pop());  // Expected output: 7
        System.out.println("Pop Result 3: " + freqStack.pop());  // Expected output: 5
        System.out.println("Pop Result 4: " + freqStack.pop());  // Expected output: 4
    }
}
