/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 15-02-2022
 *   Time: 21:36
 *   File: LargestSubArrayOfSumK.java
 */

package problemset;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayOfSumK {

    public static int getLargestSubArray(int[] nums, int sum){
        Map<Integer, Integer> map =  new HashMap<>();
        map.put(0, -1);
        int maxLength = -1;
        int cumulativeSum = 0;
        for(int i = 0; i < nums.length; i++){
            cumulativeSum += nums[i];
            if(cumulativeSum == sum)
                maxLength = Math.max(maxLength, i + 1);
            if(!map.containsKey(cumulativeSum - sum))
                map.put(cumulativeSum, i);
            if(map.containsKey(cumulativeSum - sum))
                maxLength = Math.max(maxLength, i - map.get(cumulativeSum - sum));
        }
        return maxLength;
    }
}
