/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 09-12-2021
 *   Time: 22:32
 *   File: HouseRobberOne.java
 */

package problemset;

public class HouseRobberOne {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        if(n == 1)
            return nums[0];
        if(n == 2)
            return Math.max(nums[0], nums[1]);


        for(int i = 0; i< n; i++){
            if(i < 2)
                dp[i] = nums[i];
            else if( i == 2)
                dp[i] = Math.max(nums[i] + nums[i-2], nums[1]);
            else{
                dp[i] = nums[i] + Math.max(dp[i-2], dp[(i-1)-2]);
            }
        }
        return Math.max(dp[n-1], dp[n-2]);
    }
}
