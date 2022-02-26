/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 27-02-2022
 *   Time: 01:38
 *   File: SudokuSolver.java
 */

package problemset;

public class SudokuSolver {

    public static void main(String[] args) {
        solveSudoku();
    }

    public static void solveSudoku(){
        char[][] sudoku = {{'5','3','.','.','7','.','.','.','.'},
                            {'6','.','.','1','9','5','.','.','.'},
                            {'.','9','8','.','.','.','.','6','.'},
                            {'8','.','.','.','6','.','.','.','3'},
                            {'4','.','.','8','.','3','.','.','1'},
                            {'7','.','.','.','2','.','.','.','6'},
                            {'.','6','.','.','.','.','2','8','.'},
                            {'.','.','.','4','1','9','.','.','5'},
                            {'.','.','.','.','8','.','.','7','9'}};

        char[] array = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

        getSolution(sudoku, array);
        for(char[] arr : sudoku) {
            for (char ch : arr) {
                System.out.print(ch + " . ");
            }
            System.out.println();
        }
    }

    public static boolean getSolution(char[][] board, char[] array){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == '.'){
                    for(int k = 0; k < array.length; k++){
                        char ch = array[k];
                        if(isValid(ch, i, j, board)){
                            board[i][j] = ch;
                            if(getSolution(board, array))
                                return true;
                            else
                                board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid(char ch, int row, int column, char[][] board){
        for(int i = 0; i < 9; i++){
            if(board[i][column] == ch)
                return false;
            if(board[row][i] == ch)
                return false;
        }
        int i = (row/3) * 3;
        int j = (column/3)*3;
        for(int x = i; x < i+3; x++){
            for(int y = j; y < j+3; y++){
                if(board[x][y] == ch)
                    return false;
            }
        }
        return true;
    }
}
