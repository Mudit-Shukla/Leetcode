/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 06-03-2022
 *   Time: 13:16
 *   File: ZeroOneMatrix.java
 */

package problemset;

import java.util.LinkedList;
import java.util.Queue;

public class ZeroOneMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{0,0,0},{0,1,0},{1,1,1}};
        int [][] newMatrix = reverseBfs(matrix);
        for(int[] arr : newMatrix){
            for(int ele : arr)
                System.out.print(ele + "  ");
            System.out.println();
        }
    }

    public static int[][] reverseBfs(int [][] matrix){
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0)
                    queue.add(new int[]{i, j});
                else
                    matrix[i][j] = -1;
            }
        }

        int level = 0;
        int[][] directions = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
        while(!queue.isEmpty()){
            int size = queue.size();
            ++level;
            while(size > 0) {
                size = size - 1;
                int[] cell = queue.poll();
                for (int[] direction : directions) {
                    int row = cell[0] + direction[0];
                    int column = cell[1] + direction[1];
                    if (row < 0 || column < 0 || row == matrix.length || column == matrix[0].length || matrix[row][column] != -1)
                        continue;
                    matrix[row][column] = level;
                    queue.add(new int[]{row, column});
                }
            }
        }
        return matrix;
    }
}
