/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 09-01-2022
 *   Time: 03:55
 *   File: MajorityElement.java
 */

package problemset;

import java.util.HashMap;

public class MajorityElement {

    public int majorityElement(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) +1);
                if(map.get(nums[i]) > nums.length/2)
                    return nums[i];
            }else{
                map.put(nums[i], 1);
            }
        }
        return -1;
    }

    public int majorityElement1(int[] nums){
        int largestFrequencyNumberAssumed = Integer.MIN_VALUE;
        int countOfNumberAssumed = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == largestFrequencyNumberAssumed)
                countOfNumberAssumed++;  // SAME NUMBER FOUND AGAIN SO INCREASE THE COUNT
            else if(countOfNumberAssumed == 0){
                largestFrequencyNumberAssumed = nums[i];    // SINCE COUNT IS ZERO ASSUME THE CURRENT NUMBER WITH THE LARGEST FREQUENCY
                countOfNumberAssumed++;
            }else
                countOfNumberAssumed--;   // IT MEANS A DIFFERENT NUMBER HAS BEEN ENCOUNTERED WHICH TRIES TO OVERPOWER THE CURRENT ASSUMED VALUE. SO DECREASE THE COUNT VALUE.
        }

        return largestFrequencyNumberAssumed;
    }
}
