package com.LeetCodeJava.q1255MaximumScoreWordsFormedbyLetters;


public class Main {
    public static void main(String[] args) {
        // Example 1
        String[] words1 = {"dog", "cat", "dad", "good"};
        char[] letters1 = {'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'};
        int[] score1 = {1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // Example 2
        String[] words2 = {"xxxz", "ax", "bx", "cx"};
        char[] letters2 = {'z', 'a', 'b', 'c', 'x', 'x', 'x'};
        int[] score2 = {4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 10};

        // Example 3
        String[] words3 = {"leetcode"};
        char[] letters3 = {'l', 'e', 't', 'c', 'o', 'd'};
        int[] score3 = {0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0};

        Solution solution = new Solution();

        // Outputs
        System.out.println(solution.maxScoreWords(words1, letters1, score1)); // Output: 23
        System.out.println(solution.maxScoreWords(words2, letters2, score2)); // Output: 27
        System.out.println(solution.maxScoreWords(words3, letters3, score3)); // Output: 0
    }
}
