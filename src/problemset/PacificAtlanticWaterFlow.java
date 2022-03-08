/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 08-03-2022
 *   Time: 04:14
 *   File: PacificAtlanticWaterFlow.java
 */

package problemset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWaterFlow {
    public static void main(String[] args) {

        List<List<Integer>> answer = new ArrayList<>();
        int n = 5;
        int[][] matrix = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        boolean[][] pacific = new boolean[n][n];
        boolean[][] atlantic = new boolean[n][n];
        for(int i = 0; i < n; i++){
            dfs(matrix, pacific, i, 0, Integer.MIN_VALUE);
            System.out.println("...");
            dfs(matrix, atlantic, i,n-1, Integer.MIN_VALUE);
            System.out.println("---");
        }

        for(int i = 0; i < n; i++){
            System.out.println("####");
            dfs(matrix, pacific,0, i, Integer.MIN_VALUE);
            System.out.println("///");
            dfs(matrix, atlantic, n-1, i, Integer.MIN_VALUE);
            System.out.println("****");
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(pacific[i][j] == atlantic[i][j])
                    answer.add(Arrays.asList(i, j));
            }
        }
        System.out.println(answer);
    }

    public static void dfs(int[][] grid, boolean[][] visited, int row, int column, int prevHeight){
        if(row < 0 || row == grid.length || column < 0 || column == grid[0].length || grid[row][column] < prevHeight || visited[row][column])
            return;
        visited[row][column] = true;
        System.out.println(row + " " + column + " " + visited[row][column]);
        dfs(grid, visited, row + 1, column, grid[row][column]);
        dfs(grid, visited, row - 1, column, grid[row][column]);
        dfs(grid, visited, row , column + 1, grid[row][column]);
        dfs(grid, visited, row , column - 1, grid[row][column]);
    }
}
