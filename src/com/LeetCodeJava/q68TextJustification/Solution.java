package com.LeetCodeJava.q68TextJustification;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int wordLength = words.length;
        int startIndex = 0;

        while (startIndex < wordLength) {
            int endIndex = startIndex;
            int countChars = 0;

            while (endIndex < wordLength &&
                    countChars + words[endIndex].length() +
                            (endIndex - startIndex) <= maxWidth) {
                countChars += words[endIndex].length();
                endIndex++;
            }

            StringBuilder sentence = new StringBuilder();
            int numWords = endIndex - startIndex;

            if (endIndex == wordLength || numWords == 1) {
                for (int i = startIndex; i < endIndex; i++) {
                    sentence.append(words[i]);

                    if (i < endIndex - 1) {
                        sentence.append(" ");
                    }
                }

                while (sentence.length() < maxWidth) {
                    sentence.append(" ");
                }
            } else {
                int totalSpaces = maxWidth - countChars;
                int spaceBetweenWords = totalSpaces / (numWords - 1);
                int extraSpaces = totalSpaces % (numWords - 1);

                for (int i = startIndex; i < endIndex; i++) {
                    sentence.append(words[i]);

                    if (i < endIndex - 1) {
                        int addSpaces = spaceBetweenWords + (i - startIndex < extraSpaces ? 1 : 0);

                        for (int j = 0; j < addSpaces; j++) {
                            sentence.append(" ");
                        }
                    }
                }
            }

            result.add(sentence.toString());
            startIndex = endIndex;
        }

        return result;

    }

}
