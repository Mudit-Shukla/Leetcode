/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 05-03-2022
 *   Time: 23:33
 *   File: CountSubIslands.java
 */

package problemset;

public class CountSubIslands {

    public static void main(String[] args) {
        int[][] grid1 = {{1,1,1,0,0},{0,1,1,1,1},{0,0,0,0,0},{1,0,0,0,0},{1,1,0,1,1}};
        int[][] grid2 = {{1,1,1,0,0},{0,0,1,1,1},{0,1,0,0,0},{1,0,1,1,0},{0,1,0,1,0}};
        int count = 0;
        for(int i = 0; i < grid1.length; i++){
            for(int j = 0; j < grid1[0].length; j++){
                if(grid1[i][j] == 1 && grid2[i][j] == 1)
                    if(getIslands(grid1, grid2, i, j))
                        ++count;
            }
        }
        System.out.println(count);
    }

    public static boolean getIslands(int[][] grid1, int[][] grid2, int row, int column){
        if(row < 0 || column < 0 || row == grid1.length || column == grid1[0].length || grid2[row][column] == 0)
            return true;
        if(grid1[row][column] == 0 && grid2[row][column] == 1)
            return false;
        grid1[row][column] = 0;
        grid2[row][column] = 0;
        boolean down = getIslands(grid1, grid2, row + 1, column);
        boolean up = getIslands(grid1, grid2, row - 1, column);
        boolean right = getIslands(grid1, grid2, row , column + 1);
        boolean left = getIslands(grid1, grid2, row , column - 1);
        return down && up && right && left;
    }
}
