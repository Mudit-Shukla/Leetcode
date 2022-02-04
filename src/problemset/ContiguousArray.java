/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 04-02-2022
 *   Time: 15:50
 *   File: ContiguousArray.java
 */

package problemset;

import java.util.HashMap;

public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxCount = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = nums[i] == 0 ? --sum : ++sum;
            if(map.containsKey(sum))
                maxCount = (i - map.get(sum)) > maxCount + 1 ? (i - map.get(sum)) : maxCount;
            else
                map.put(sum, i);
        }
        return maxCount;
    }

}
