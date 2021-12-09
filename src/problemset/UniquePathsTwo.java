/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 09-12-2021
 *   Time: 22:28
 *   File: UniquePathsTwo.java
 */

package problemset;

public class UniquePathsTwo {

    public int uniquePathsWithObstacles(int[][] array) {
        int n = array.length;
        int m = array[0].length;
        if(array[0][0] == 1)
            return 0;
        array[0][0] = 1;
        for (int i = 1; i < n; i++) {
            array[i][0] = (array[i][0] == 0 && array[i - 1][0] == 1) ? 1 : 0;
        }
        for (int i = 1; i < m; i++) {
            array[0][i] = (array[0][i] == 0 && array[0][i - 1] == 1) ? 1 : 0;
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++ ){
                if(array[i][j] == 1)
                    array[i][j] = 0;
                else
                    array[i][j] = array[i-1][j] + array[i][j-1];
            }
        }
        return array[n-1][m-1];
    }
}
