/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 04-03-2022
 *   Time: 22:36
 *   File: NumberOfClosedIslands.java
 */

package problemset;

import java.util.Scanner;

public class NumberOfClosedIslands {

    public static void main(String[] args) {
        int count = 0;
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
                if(grid[i][j] == 0){
                    if(getClosedIslands(grid, i, j))
                        ++count;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean getClosedIslands(int[][] grid, int row, int column){

        if(grid[row][column] == -1 || grid[row][column] == 1)
            return true;
        if(row < 1 || column < 1 || row > grid.length - 1 || column > grid[0].length - 1)
            return false;
        grid[row][column] = -1;
        boolean down = getClosedIslands(grid, row + 1, column);
        boolean up = getClosedIslands(grid, row - 1, column);
        boolean right = getClosedIslands(grid, row, column + 1);
        boolean left = getClosedIslands(grid, row , column - 1);
        return down && up && right && left;
    }
}
