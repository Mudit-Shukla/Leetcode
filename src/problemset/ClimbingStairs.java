/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 07-10-2021
 *   Time: 04:44
 *   File: ClimbingStairs.java
 */

package problemset;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n){

        if(n == 1)
            return 1;
        else if( n== 2)
            return 2;

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i< dp.length; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
