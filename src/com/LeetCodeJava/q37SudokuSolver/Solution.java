package com.LeetCodeJava.q37SudokuSolver;

class Solution {
    public void solveSudoku(char[][] board) {
        sudoku(board);
    }

    private boolean sudoku(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {

                if (board[row][col] != '.') {
                    continue;
                }

                for (char c = '1'; c <= '9'; c++) {
                    if (checkRowColSubgrid(board, row, col, c)) {
                        board[row][col] = c;

                        if (sudoku(board)) {
                            return true;
                        }

                        board[row][col] = '.';
                    }
                }

                return false;
            }
        }

        return true;
    }

    private boolean checkRowColSubgrid(char[][] board, int row, int col, char k) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == k) {
                return false;
            }
            if (board[i][col] == k) {
                return false;
            }
        }

        return checkSubgrid(board, row, col, k);
    }

    private boolean checkSubgrid(char[][] board, int row, int col, char k) {
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == k) {
                    return false;
                }
            }
        }

        return true;
    }
}
