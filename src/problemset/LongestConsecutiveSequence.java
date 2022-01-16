/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 16-01-2022
 *   Time: 14:31
 *   File: LongestConssecutiveSequence.java
 */

package problemset;

import java.util.*;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        System.out.println(longestConsecutiveSubsequence(new int[]{100,4,200,1,3,2}));
    }

    public static int longestConsecutiveSubsequence(int[] nums){

        if(nums.length == 0)
            return 0;
        Map<Integer, Boolean>map = new HashMap<>();
        for(int num : nums)
            map.put(num, true);
        for(Map.Entry<Integer, Boolean> entity : map.entrySet()){
            if(map.containsKey(entity.getKey()-1))
                map.put(entity.getKey(), false);
        }

        int count = 1; int maxCount = count;
        for(int num : nums){
            if(map.get(num)){
                while(map.containsKey(num + count))
                    count++;
                maxCount = Math.max(count, maxCount);
                count = 1;
            }
        }
        return maxCount;
    }
}
