/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 27-02-2022
 *   Time: 03:33
 *   File: FloodHill.java
 */

package problemset;

public class FloodHill {

    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        floodHill(image, 1, 1, 2);
    }

    public static void floodHill(int[][] image, int sc, int sr, int newColor){
        boolean[][] visited = new boolean[image.length][image[0].length];
        int baseColor = image[sr][sc];
        getSolutions(image, visited, sc, sr, newColor, baseColor);
        for(int[] arr : image){
            for(int ele : arr){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static void getSolutions(int[][] image, boolean[][] visited, int sc, int sr, int newColor, int baseColor){
        if(sc < 0 || sr < 0 || sc > image[0].length - 1 || sr > image.length - 1 || visited[sr][sc] || image[sr][sc] != baseColor)
            return;
        visited[sr][sc] = true;
        image[sr][sc] = newColor;
        getSolutions(image, visited, sc+1, sr, newColor, baseColor);
        getSolutions(image, visited, sc, sr+1, newColor, baseColor);
        getSolutions(image, visited, sc-1, sr, newColor, baseColor);
        getSolutions(image, visited, sc, sr-1, newColor, baseColor);
    }
}
