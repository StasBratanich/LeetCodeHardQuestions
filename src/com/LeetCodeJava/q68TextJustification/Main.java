package com.LeetCodeJava.q68TextJustification;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        String[] words1 = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth1 = 16;
        List<String> output1 = solution.fullJustify(words1, maxWidth1);
        System.out.println(output1);

        // Example 2
        String[] words2 = {"What", "must", "be", "acknowledgment", "shall", "be"};
        int maxWidth2 = 16;
        List<String> output2 = solution.fullJustify(words2, maxWidth2);
        System.out.println(output2);

        // Example 3
        String[] words3 = {
                "Science", "is", "what", "we", "understand", "well", "enough",
                "to", "explain", "to", "a", "computer.", "Art", "is",
                "everything", "else", "we", "do"
        };
        int maxWidth3 = 20;
        List<String> output3 = solution.fullJustify(words3, maxWidth3);
        System.out.println(output3);
    }
}
