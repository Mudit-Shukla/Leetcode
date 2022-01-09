/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 09-01-2022
 *   Time: 12:09
 *   File: MajorityElement2.java
 */

package problemset;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {


    //  **********  BOYER MOORE VOTING ALGORITHM  *******************

    // BRUTE FORCE APPROACH COULD BE TO USE SORTING TECHNIQUES OR USING HASHMAP

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int largestFrequencyNum1 = Integer.MIN_VALUE;
        int largestFrequencyNum2 = Integer.MIN_VALUE;

        int countOfNum1 = 0;
        int countOfNum2 = 0;

        for (int i = 0; i < nums.length; i++){
            if(largestFrequencyNum1 == nums[i])
                countOfNum1 ++;
            else if(largestFrequencyNum2 == nums[i])
                countOfNum2 ++;
            else if(countOfNum1 == 0){
                largestFrequencyNum1 = nums[i];
                countOfNum1++;
            }else if(countOfNum2 == 0){
                largestFrequencyNum2 = nums[i];
                countOfNum2 ++;
            }
            else{
                countOfNum1--;
                countOfNum2--;
            }
        }

        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == largestFrequencyNum1)
                count1++;
            else if(nums[i] == largestFrequencyNum2)
                count2++;
        }
        if(count1 > nums.length/3)
            list.add(largestFrequencyNum1);
        if(count2 > nums.length/3)
            list.add(largestFrequencyNum2);

        return list;

    }
}
