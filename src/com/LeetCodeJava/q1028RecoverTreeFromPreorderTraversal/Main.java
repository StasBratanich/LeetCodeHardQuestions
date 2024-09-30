package com.LeetCodeJava.q1028RecoverTreeFromPreorderTraversal;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        String traversal1 = "1-2--3--4-5--6--7";
        TreeNode result1 = solution.recoverFromPreorder(traversal1);
        System.out.println("Example 1 Tree:");
        solution.printTree(result1);

        // Example 2
        String traversal2 = "1-2--3---4-5--6---7";
        TreeNode result2 = solution.recoverFromPreorder(traversal2);
        System.out.println("Example 2 Tree:");
        solution.printTree(result2);

        // Example 3
        String traversal3 = "1-401--349---90--88";
        TreeNode result3 = solution.recoverFromPreorder(traversal3);
        System.out.println("Example 3 Tree:");
        solution.printTree(result3);
    }
}
