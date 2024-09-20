package com.LeetCodeJava.q1028RecoverTreeFromPreorderTraversal;

public class Solution {
    public TreeNode recoverFromPreorder(String traversal) {
        TreeNode tree = new TreeNode();
        int root = Character.getNumericValue(traversal.charAt(0));

        tree.val = root;
        int countDash = 0;

        for (int i = 1; i < traversal.length(); i++) {
            if (traversal.charAt(i) == '-') {
                countDash++;
            }
        }

        return tree;
    }
}
