/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 10-02-2022
 *   Time: 18:34
 *   File: MaximumSubarrayOfSizeKGFG.java
 */

package problemset;

import java.util.ArrayList;

public class MaximumSubarrayOfSizeKGFG {

    public static int getMaxSubArray(ArrayList<Integer> nums, int k){
        int start = 0;
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;

        for(int i = 0; i< nums.size(); i++){
            windowSum = windowSum + nums.get(i);
            if(i >= k){
                windowSum = windowSum - nums.get(start);
                start++;
            }
            if(windowSum > maxSum)
                maxSum = windowSum;
        }
        return maxSum;
    }
}
