/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 06-01-2022
 *   Time: 23:40
 *   File: IfMatrixObtainedByRotation.java
 */

package problemset;

public class IfMatrixObtainedByRotation {

    /**
     * MAKE TRANSPOSE OF MATRIX AND THEN SWAP ALL COLUMNS TO ROTATE THE MATRIX BY 90 DEGREE
     * THEN CHECK THE EQUALITY OF THE MATRIX
     */

    public boolean findRotation(int[][] mat, int[][] target) {
        boolean flag = false;
        for(int i = 0; i< 5; i++){
            flag = checkEquality(mat, target);
            if(flag)
                break;
            makeTranspose(mat);
        }
        return flag;
    }

    public void makeTranspose(int[][] mat){
        for(int i =0; i< mat.length; i++){
            for(int j = i; j < mat.length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        swapColumns(mat);
    }

    public void swapColumns(int[][] mat){
        int last = mat.length;
        for(int i = 0; i< mat.length; i++){
            for(int j = 0; j < last/2; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][last-j-1];
                mat[i][last-j-1] = temp;
            }
        }
    }


    public boolean checkEquality(int[][] mat, int[][] target){
        for(int i = 0; i< mat.length; i++){
            for(int j = 0; j< mat.length; j++)
                if(mat[i][j] != target[i][j])
                    return false;
        }
        return true;
    }
}
