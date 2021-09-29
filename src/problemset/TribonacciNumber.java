/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 29-09-2021
 *   Time: 18:27
 *   File: TribonacciNumber.java
 */

package problemset;

public class TribonacciNumber {
    public static void main(String[] args) {
        int n = 25;
        int [] dp  = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3; i< dp.length; i++)
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        System.out.println(dp[n]);
    }
}
