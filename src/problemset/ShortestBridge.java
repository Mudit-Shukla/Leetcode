/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 12-03-2022
 *   Time: 22:20
 *   File: ShortestBridge.java
 */

package problemset;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestBridge {
    public static void main(String[] args) {
        int[][] grid = {{1,1,1,1,1},
                        {1,0,0,0,1},
                        {1,0,1,0,1},
                        {1,0,0,0,1},
                        {1,1,1,1,1}};
        int answer = getShortestBridge(grid);
        System.out.println(answer);
        System.out.println();
        for(int [] arr : grid){
            for (int ele : arr){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static int getShortestBridge(int[][] grid){
        Queue<int[]> list = new LinkedList<>();
        boolean flag = false;
        for(int i = 0; i < grid.length && !flag; i++){
            for(int j = 0; j < grid[0].length && !flag; j++){
                if(grid[i][j] == 1) {
                    dfs(i, j, grid, list);
                    flag = true;
                }
            }
        }

        for(int [] arr : grid){
            for (int ele : arr){
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        for(int[] ele : list){
            System.out.print(ele[0]+""+ele[1] + " ");
        }

        int level = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (list.size() != 0){
            int size = list.size();
            while (size--> 0){
                int[] cell = list.poll();
                for(int [] direction : directions) {
                    int row = cell[0] + direction[0];
                    int column = cell[1] + direction[1];
                    if (row < 0 || column < 0 || row == grid.length || column == grid[0].length || grid[row][column] == -1)
                        continue;
                    if (grid[row][column] == 1)
                        return level;
                    list.add(new int[]{row, column});
                    grid[row][column] = -1;

                }
            }
            ++level;
        }

        return level;
    }

    public static void dfs(int row, int column, int[][] grid, Queue<int[]> list){
        if(row < 0 || column < 0 || row == grid.length || column == grid[0].length || grid[row][column] != 1)
            return;
        grid[row][column] = -1;
        list.add(new int[]{row, column});
        dfs(row-1, column, grid, list);
        dfs(row+1, column, grid, list);
        dfs(row, column+1, grid, list);
        dfs(row, column-1, grid, list);
    }
}
