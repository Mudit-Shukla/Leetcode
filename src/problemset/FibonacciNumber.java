/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 29-09-2021
 *   Time: 18:20
 *   File: FibonacciNumber.java
 */

package problemset;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 4;
        int [] dp  = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i< dp.length; i++)
            dp[i] = dp[i-1] + dp[i-2];
        System.out.println(dp[n]);
    }
}
