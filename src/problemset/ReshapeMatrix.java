/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 22-09-2021
 *   Time: 18:02
 *   File: ReshapeMatrix.java
 */

package problemset;

import java.util.Scanner;

public class ReshapeMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [][] matrix = {{1,2,3}, {4,5,6}};
        int a = matrix.length;
        int b = matrix[0].length;

        int m = sc.nextInt();
        int n = sc.nextInt();


        if(a == m && b == n)
            // return matrix
            System.out.println(1);
        else{
            int[][] newMatrix = new int[m][n];
            int row = 0;
            int column = 0;
            for(int i =0; i< a; i++){
                for(int j= 0; j< b; j++){
                    if(row == m){
                        row = 0;
                        column ++;
                    }else if(column == n){
                        column = 0;
                        row ++;
                    }

                    newMatrix[row][column] = matrix[i][j];
                }
            }
        }
    }
}
