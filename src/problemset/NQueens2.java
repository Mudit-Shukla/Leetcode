/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 26-02-2022
 *   Time: 16:19
 *   File: NQueens2.java
 */

package problemset;

import java.util.ArrayList;
import java.util.List;

public class NQueens2 {

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
        int count = 0;
        getSolutions(board, column, normalDiagonal, reversDiagonal, 0, count);
        System.out.println(count);
    }

    public static void getSolutions(String[][] board, boolean[] column, boolean[] normalDiagonal, boolean[] reverseDiagonal, int row, int count){

        if(row == board.length){
            count += 1;
            return;
        }
        for(int i = 0; i < board.length; i++){
            if(checkValidity(row, i, column, normalDiagonal, reverseDiagonal)){
                board[row][i] = "Q";
                column[i] = true;
                normalDiagonal[row + i] = true;
                reverseDiagonal[row - i + board.length - 1] = true;
                getSolutions(board, column, normalDiagonal, reverseDiagonal, row +1, count);
                board[row][i] = ".";
                column[i] = false;
                normalDiagonal[row + i] = false;
                reverseDiagonal[row - i + board.length - 1] = false;
            }
        }
    }


    public static boolean checkValidity(int row, int col, boolean[] column, boolean[] normalDiagonal, boolean[] reverseDiagonal){
        return !column[col] && !normalDiagonal[row + col] && !reverseDiagonal[row - col + column.length - 1];
    }
}
