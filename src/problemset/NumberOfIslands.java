/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 05-01-2022
 *   Time: 11:26
 *   File: NumberOfIslands.java
 */

package problemset;

public class NumberOfIslands {

    // '1' symbolizes land and '0' symbolizes water

    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int numberOfIslands = 0;
        for(int row = 0; row < grid.length; row++)
            for(int column = 0; column< grid[0].length; column++){
                if(!visited[row][column] && grid[row][column] == '1'){
                    numberOfIslands += getIslands(grid, visited, row, column);
                }
            }
        return numberOfIslands;
    }

    public int getIslands(char [][] grid, boolean[][] visited, int row, int column){
        if(row < 0 || column < 0 || row > grid.length-1 || column > grid[0].length-1)
            return 0;
        if(visited[row][column] || grid[row][column] != '1')
            return 0;
        visited[row][column] = true;
        getIslands(grid, visited, row, column-1);
        getIslands(grid, visited, row, column+1);
        getIslands(grid, visited, row-1, column);
        getIslands(grid, visited, row+1, column);
        return 1;
    }



}
