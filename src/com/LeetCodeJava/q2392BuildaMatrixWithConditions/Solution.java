package com.LeetCodeJava.q2392BuildaMatrixWithConditions;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Solution {
    public static int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        int[][] kMatrix = new int[k][k];

        LinkedList<Integer> colList = new LinkedList<>();
        LinkedList<Integer> rowList = new LinkedList<>();

        for (int i = 0; i < colConditions.length; i++) {
            for (int j = 0; j < colConditions[0].length; j++) {

                if(colList.contains(colConditions[i][j])){
                    int last = colList.getLast();
                    colList.removeLast();

                    for (int m = 0; m < colList.size(); m++) {
                        if (colList.get(m) == colConditions[i][j]){
                            colList.add(m, last);
                            m++;
                        }
                    }
                } else {
                    colList.add(colConditions[i][j]);
                }

//                if(rowList.contains(rowConditions[i][j])){
//                    int last = rowList.getLast();
//                    rowList.removeLast();
//
//                    for (int m = 0; m < rowList.size(); m++) {
//                        if (rowList.get(m) == rowConditions[i][j]){
//                            rowList.add(m, last);
//                            m++;
//                        }
//                    }
//                } else {
//                    rowList.add(rowConditions[i][j]);
//                }
            }
        }

        System.out.print("col List = " + colList);
        System.out.println("");
        System.out.print("row List = " + rowList);
        System.out.println("");

        for (int row = 0; row < rowList.size(); row++){
            for (int col = 0; col < colList.size(); col++){
                if (rowList.get(row) == colList.get(col)) {
                    kMatrix[row][col] = rowList.get(row);
                }
            }
        }

        return kMatrix;
    }
}
