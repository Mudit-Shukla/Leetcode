/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 07-01-2022
 *   Time: 00:08
 *   File: RotateImage.java
 */

package problemset;

public class RotateImage {
    public void rotate(int[][] matrix) {
        for(int i = 0; i< matrix.length; i++){
            for(int j = i; j< matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix.length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1] = temp;
            }
        }
    }
}
