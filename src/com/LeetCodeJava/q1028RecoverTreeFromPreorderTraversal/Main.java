package com.LeetCodeJava.q1028RecoverTreeFromPreorderTraversal;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        String traversal1 = "1-2--3--4-5--6--7";
        // Expected output: The reconstructed binary tree with root value 1
        System.out.println("Example 1 Result: " + solution.recoverFromPreorder(traversal1));

        // Example 2
        String traversal2 = "1-2--3---4-5--6---7";
        // Expected output: The reconstructed binary tree with root value 1
        System.out.println("Example 2 Result: " + solution.recoverFromPreorder(traversal2));

        // Example 3
        String traversal3 = "1-401--349---90--88";
        // Expected output: The reconstructed binary tree with root value 1
        System.out.println("Example 3 Result: " + solution.recoverFromPreorder(traversal3));
    }
}
