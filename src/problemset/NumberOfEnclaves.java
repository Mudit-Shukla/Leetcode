/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 05-03-2022
 *   Time: 01:39
 *   File: NumberOfEnclaves.java
 */

package problemset;

import java.util.Scanner;

public class NumberOfEnclaves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(i == 0 || j == 0 || i == grid.length - 1 || j == grid[0].length - 1)
                    getIslands(grid, i, j);
            }
        }

        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1)
                    ++count;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(count);
    }

    public static void getIslands(int[][] grid, int row, int column){
        if(row < 0 || column < 0 || row == grid.length || column == grid[0].length)
            return;
        if(grid[row][column] == 0 || grid[row][column] == -1)
            return;
        grid[row][column] = -1;
        getIslands(grid, row + 1, column);
        getIslands(grid, row - 1, column);
        getIslands(grid, row, column + 1);
        getIslands(grid, row, column - 1);
    }
}
