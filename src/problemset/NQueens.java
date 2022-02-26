/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 26-02-2022
 *   Time: 14:51
 *   File: NQueens.java
 */

package problemset;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public static void main(String[] args) {
        solveNQueens(4);
    }

    public static void solveNQueens(int n){
        List<List<String>> result = new ArrayList<>();
        boolean[] column = new boolean[n];
        boolean[] normalDiagonal = new boolean[2*n+1];
        boolean[] reversDiagonal = new boolean[2*n+1];
        String [][] board = new String[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                board[i][j] = ".";
            }
        }
        getSolutions(board, column, normalDiagonal, reversDiagonal, 0, result);
        for(List<String> ls : result)
            System.out.println(ls);
    }

    public static void getSolutions(String[][] board, boolean[] column, boolean[] normalDiagonal, boolean[] reverseDiagonal, int row, List<List<String>> result){

        if(row == board.length){
            List<String> solutions = addString(board, new ArrayList<>());
            result.add(solutions);
            return;
        }
        for(int i = 0; i < board.length; i++){
            if(checkValidity(row, i, column, normalDiagonal, reverseDiagonal)){
                board[row][i] = "Q";
                column[i] = true;
                normalDiagonal[row + i] = true;
                reverseDiagonal[row - i + board.length - 1] = true;
                getSolutions(board, column, normalDiagonal, reverseDiagonal, row +1, result);
                board[row][i] = ".";
                column[i] = false;
                normalDiagonal[row + i] = false;
                reverseDiagonal[row - i + board.length - 1] = false;
            }
        }
    }

    public static List<String> addString(String[][] board, List<String> list){
        for (String[] strings : board) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < board.length; j++)
                s.append(strings[j]);
            list.add(s.toString());
        }
        return list;
    }

    public static boolean checkValidity(int row, int col, boolean[] column, boolean[] normalDiagonal, boolean[] reverseDiagonal){
        return !column[col] && !normalDiagonal[row + col] && !reverseDiagonal[row - col + column.length - 1];
    }

}
