package com.LeetCodeJava.q1028RecoverTreeFromPreorderTraversal;

import java.util.Stack;

public class Solution {
    public TreeNode recoverFromPreorder(String traversal) {
        int level;
        int length = traversal.length();
        int i = 0;
        Stack<TreeNode> stack = new Stack<>();

        while (i < length) {
            level = 0;
            while (i < length && traversal.charAt(i) == '-') {
                level++;
                i++;
            }

            int num = 0;
            while (i < length && Character.isDigit(traversal.charAt(i))) {
                num = num * 10 + (traversal.charAt(i) - '0');
                i++;
            }

            TreeNode node = new TreeNode(num);

            while (stack.size() > level) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                if (stack.peek().left == null) {
                    stack.peek().left = node;
                } else {
                    stack.peek().right = node;
                }
            }

            stack.push(node);
        }

        return stack.isEmpty() ? null : stack.firstElement();
    }

    public void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

}
