/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 27-02-2022
 *   Time: 15:12
 *   File: MaxAreaOfIsland.java
 */

package problemset;

public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {

        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int maxArea = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1)
                    maxArea = Math.max(maxArea, getSolutions(grid, visited, i, j, 0));
            }
        }
        return maxArea;
    }

    public int getSolutions(int[][] grid, boolean[][] visited, int row, int column, int area){
        if(row < 0 || column < 0 || row > grid.length-1 || column > grid[0].length-1 || visited[row][column] || grid[row][column] == 0)
            return area;
        visited[row][column] = true;
        area += 1;
        area = getSolutions(grid, visited, row+1, column, area);
        area = getSolutions(grid, visited, row, column+1, area);
        area = getSolutions(grid, visited, row-1, column, area);
        area = getSolutions(grid, visited, row, column-1, area);
        return area;

    }

}
