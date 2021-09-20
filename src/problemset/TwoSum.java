/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 01-09-2021
 *   Time: 18:01
 *   File: TwoSum.java
 */

package problemset;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i]))
                return new int[] {i, map.get(target - nums[i])};
            map.put(nums[i], i);
        }

        return new int[2];

    }
}
