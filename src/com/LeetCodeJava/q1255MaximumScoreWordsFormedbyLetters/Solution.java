package com.LeetCodeJava.q1255MaximumScoreWordsFormedbyLetters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {

        Map<Character, Integer> counterMap = createCounterMap(letters);

        return createWordsPermutations(words, 0, counterMap, score);

    }

    private int createWordsPermutations(String[] words, int index, Map<Character, Integer> counterMap, int[] score) {
        if (index == words.length) {
            return 0;
        }
        int maxScore = createWordsPermutations(words, index + 1, counterMap, score);

        int currentWordScore = calculateWordScore(words[index], counterMap, score);
        if (currentWordScore != -1) {
            updateCounterMap(words[index], counterMap, -1);
            maxScore = Math.max(maxScore, currentWordScore + createWordsPermutations(words, index + 1, counterMap, score));
            updateCounterMap(words[index], counterMap,  1);
        }

        return maxScore;
    }
    private Map<Character, Integer> createCounterMap(char[] letters) {
        Map<Character, Integer> counterMap = new HashMap<>();
        for (char letter : letters) {
            counterMap.put(letter, counterMap.getOrDefault(letter, 0) + 1);
        }

        return counterMap;
    }
    private void updateCounterMap(String word, Map<Character, Integer> counterMap, int value) {
        for (char c : word.toCharArray()) {
            counterMap.put(c, counterMap.getOrDefault(c, 0) + value);
        }
    }
    private int calculateWordScore(String word, Map<Character, Integer> counterMap, int[] score) {
        int wordScore = 0;
        Map<Character, Integer> tempCount = new HashMap<>(counterMap);

        for (char c : word.toCharArray()) {
            if (tempCount.getOrDefault(c, 0) <= 0) {
                return -1;
            }
            tempCount.put(c, tempCount.get(c) - 1);
            wordScore += score[c - 'a'];
        }

        return wordScore;
    }
}
