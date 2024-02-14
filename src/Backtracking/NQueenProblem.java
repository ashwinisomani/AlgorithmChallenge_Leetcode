package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class NQueenProblem {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> result =  NQueenProblem.solveNQueens(n);
        System.out.println(result);

    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');
        backtracking(0, board, result);
        return result;
    }

    static HashSet<Integer> vertical = new HashSet<>();
    static HashSet<Integer> diagonalleft = new HashSet<>();
    static HashSet<Integer> diagonalright = new HashSet<>();

    public static void backtracking(int row, char[][] board, List<List<String>> result) {
        if (row == board.length) {
            List<String> current = new ArrayList<>();
            for (char[] r : board) {
                current.add(new String(r));
            }
            result.add(current);
            return;
        }

        for (int i = 0; i < board[row].length; i++) {
            if (!vertical.contains(i) && !diagonalleft.contains(row - i) && !diagonalright.contains(row + i)) {
                board[row][i] = 'Q';
                vertical.add(i);
                diagonalleft.add(row - i);
                diagonalright.add(row + i);

                backtracking(row + 1, board, result);

                board[row][i] = '.';
                vertical.remove(i);
                diagonalleft.remove(row - i);
                diagonalright.remove(row + i);
            }
        }
    }
}
