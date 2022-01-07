/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 07-01-2022
 *   Time: 15:16
 *   File: FindAllDuplicatesInArray.java
 */

package problemset;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {

    public List<Integer> getDuplicates(int [] nums){
        List<Integer> list = new ArrayList<>();
        for(int i =0; i< nums.length; i++){
            int targetIndex = Math.abs(nums[i]) -1;
            if(nums[targetIndex] < 0)
                list.add(nums[i]);
            else
                nums[targetIndex] *= -1;
        }
        return list;
    }
}
