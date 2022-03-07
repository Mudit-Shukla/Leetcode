/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 07-03-2022
 *   Time: 00:03
 *   File: AsFromLandAsPossible.java
 */

package problemset;

import java.util.LinkedList;
import java.util.Queue;

public class AsFromLandAsPossible {
    public static void main(String[] args) {
        int[][] grid = {{1,0,1},{0,0,0},{1,0,1}};
        bfs(grid);
    }

    public static void bfs(int[][] grid){
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        int level = 1;
        int maxDistance = 0;
        int[][] directions = {{1,0}, {-1, 0}, {0, -1}, {0, 1}};
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size > 0){
                int[] cell = queue.remove();
                --size;
                for(int[] direction : directions){
                    int row = cell[0] + direction[0];
                    int column = cell[1] + direction[1];
                    if(row < 0 || column < 0 || row == grid.length || column == grid[0].length || grid[row][column] == 1 || visited[row][column])
                        continue;
                    visited[row][column] = true;
                    maxDistance = Math.max(level, maxDistance);
                    queue.add(new int[]{row, column});
                }
            }
            ++level;
        }
        System.out.println(maxDistance);
    }


    public static void maxDistance(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    q.add(new int[]{i,j});
                    vis[i][j] = true;
                }
            }
        }
        if(q.isEmpty() || q.size() == n*m) return ;
        int[][] directions = {{1,0}, {-1, 0}, {0, -1}, {0, 1}};
        int maxDistance = 0;
        int level = 1;
        while(!q.isEmpty()){
            int size = q.size();
            while (size > 0){
                size--;
                int[] top = q.remove();
                for(int[] dir : directions){
                    int x = top[0] + dir[0];
                    int y = top[1] + dir[1];
//                    int x = currX + dir[j], y = currY + dir[j+1];
                    if(x < 0 || x == n || y < 0 || y == m || vis[x][y]) continue;
                    if(grid[x][y] == 1) continue;
                    maxDistance = Math.max(maxDistance,level);
                    vis[x][y] = true;
                    q.add(new int[]{x,y});
                }
            }
            level++;
        }
//        return maxDistance;
        System.out.println(maxDistance);
    }
}

