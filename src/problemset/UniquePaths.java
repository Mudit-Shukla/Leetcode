/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 07-10-2021
 *   Time: 23:52
 *   File: UniquePaths.java
 */

package problemset;

public class UniquePaths {
    public static void main(String[] args) {

        System.out.println(uniquePaths2(3, 7));

    }

    /***
     * This is recursive approach. It gives TLE for larger inputs
     * @param m : number of rows
     * @param n : number of columns
     * @return number of possible paths
     */

    public static int uniquePaths(int m, int n){
        if(m == 1 || n == 1)
            return 1;
        return uniquePaths(m-1, n) + uniquePaths(m, n-1);
    }

    /**
     * This is DP solution to the same problem
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Paths.
     * Memory Usage: 35.5 MB, less than 90.41% of Java online submissions for Unique Paths.
     * @param m : number of rows
     * @param n : number of columns
     * @return number fo possible paths
     */

    public static int uniquePaths2(int m, int n){
        int[][] dp = new int[m][n];
        dp[0][0] = 0;
        for(int i = 0; i< m; i++)
            dp[i][0] = 1;
        for(int i =0; i< n; i++)
            dp[0][i] = 1;
        for(int i = 1; i< m; i++)
            for(int j = 1; j< n; j++)
                dp[i][j] = dp[i-1][j] + dp[i][j-1];

        return dp[m-1][n-1];
    }
}
