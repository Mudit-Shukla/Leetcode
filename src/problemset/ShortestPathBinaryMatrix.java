/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 08-03-2022
 *   Time: 06:01
 *   File: ShortestPathBinaryMatrix.java
 */

package problemset;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathBinaryMatrix {
    public static void main(String[] args) {
        int[][] grid = {{0,0,0},{1,1,0},{1,1,0}};
        System.out.println(bfs(grid));
    }

    public static int bfs(int[][] grid){
        Queue<int[]> queue = new LinkedList<>();
        if(grid[0][0] == 1 || grid[grid.length - 1][grid.length-1] == 1)
            return -1;
        grid[0][0] = 1;
        int[][] directions = {{1,0}, {0,1}, {-1,0}, {0, -1}, {-1, 1}, {1, -1}, {1, 1}, {-1, -1}};
        queue.add(new int[]{0,0});
        while (!queue.isEmpty()){
            int size = queue.size();
            int [] cell = queue.poll();
            for(int i = 0; i < size; i++){
                for(int [] direction : directions){
                    int row = cell[0] + direction[0];
                    int column = cell[1] + direction[1];
                    if(row >= 0 && column >= 0 && row < grid.length && column < grid[0].length && grid[row][column] == 0) {
                        grid[row][column] = grid[cell[0]][cell[1]] + 1;
                        queue.add(new int[]{row, column});
                    }
                }
            }
        }

        return grid[grid.length-1][grid[0].length-1];
    }
}
