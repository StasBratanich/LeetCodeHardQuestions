package com.LeetCodeJava.q2392BuildaMatrixWithConditions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {

        int[] topologicalRow = topologicalSort(k, rowConditions);
        if (topologicalRow == null) {
            return new int[0][0];
        }

        int[] topologicalColumn = topologicalSort(k, colConditions);
        if (topologicalColumn == null) {
            return new int[0][0];
        }

        int[][] matrix = new int[k][k];
        int[] row = new int[k + 1];
        int[] col = new int[k + 1];

        for (int i = 0; i < k; i++) {
            row[topologicalRow[i]] = i;
            col[topologicalColumn[i]] = i;
        }

        for (int i = 1; i <= k; i++) {
            matrix[row[i]][col[i]] = i;
        }

        return matrix;
    }

    private int[] topologicalSort(int k, int[][] conditions) {
        List<Integer>[] topologicalList = new ArrayList[k + 1];
        int[] countEdgesIn = new int[k + 1];

        for(int i = 1; i <= k; i++) {
            topologicalList[i] = new ArrayList<>();
        }

        for (int[] condition : conditions) {
            int u = condition[0], v = condition[1];
            topologicalList[u].add(v);
            countEdgesIn[v]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= k; i++) {
            if (countEdgesIn[i] == 0) {
                queue.offer(i);
            }
        }

        int[] order = new int[k];
        int index = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            order[index++] = node;

            for (int neighbor: topologicalList[node]) {
                countEdgesIn[neighbor]--;

                if (countEdgesIn[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        return index == k ? order : null;
    }
}
