/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 30-01-2022
 *   Time: 01:49
 *   File: MaxConsecutiveOnes.java
 */

package problemset;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int num : nums){
            if(num == 1)
                count++;
            else{
                max = Math.max(count, max);
                count = 0;
            }
        }
        return Math.max(max, count);
    }

}
