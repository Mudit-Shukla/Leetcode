/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 10-12-2021
 *   Time: 01:46
 *   File: JumpGameOne.java
 */

package problemset;

public class JumpGameOne {
    public boolean jumpGame(int [] nums){
        int n = nums.length;
        int stepsPossible = nums[0];
        for(int i = 0; i< n; i++){
            if(stepsPossible < i)
                return false;
            stepsPossible = Math.max(nums[i] + i, stepsPossible);
        }
        return true;
    }
}
