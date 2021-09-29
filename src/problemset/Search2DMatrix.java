/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 29-09-2021
 *   Time: 19:29
 *   File: Search2DMatrix.java
 */

package problemset;

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7, 8,9}, {10, 12,14,15, 16, 20}};
        int target = 16;
        boolean result = false;

        for (int i = 0; i < matrix.length; i++) {
            if (target <= matrix[i][matrix[0].length - 1]) {
                int start = 0;
                int end = matrix[0].length - 1;
                while (start <= end) {
                    int mid = (start + end) / 2;
                    if (matrix[i][mid] == target) {
                        result = true;
                        break;
                    }
                    else if (matrix[i][mid] < target)
                        start = mid + 1;
                    else
                        end = mid - 1;
                }
            }
        }
        System.out.println(result);
    }
}
