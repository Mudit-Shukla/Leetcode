/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 09-12-2021
 *   Time: 22:33
 *   File: HouseRobberTwo.java
 */

package problemset;

public class HouseRobberTwo {
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        else if(nums.length == 2)
            return Math.max(nums[0], nums[1]);
        else
            return Math.max(robFromFirst(nums), robFromSecond(nums));
    }

    public int robFromFirst(int[] nums){
        int robbedPrevious = 0;
        int didNotRobbedPrevious = 0;
        for(int i = 0; i< nums.length-1; i++){
            int currentRobbed = nums[i] + didNotRobbedPrevious;
            int currentNotRobbed = Math.max(robbedPrevious, didNotRobbedPrevious);
            didNotRobbedPrevious = currentNotRobbed;
            robbedPrevious = currentRobbed;
        }
        return Math.max(robbedPrevious, didNotRobbedPrevious);
    }

    public int robFromSecond(int[] nums){
        int robbedPrevious = 0;
        int didNotRobbedPrevious = 0;
        for(int i = 1; i< nums.length; i++){
            int currentRobbed = nums[i] + didNotRobbedPrevious;
            int currentNotRobbed = Math.max(robbedPrevious, didNotRobbedPrevious);
            didNotRobbedPrevious = currentNotRobbed;
            robbedPrevious = currentRobbed;
        }
        return Math.max(robbedPrevious, didNotRobbedPrevious);
    }
}
