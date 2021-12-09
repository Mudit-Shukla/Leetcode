/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 10-12-2021
 *   Time: 00:17
 *   File: DeleteAndEarn.java
 */

package problemset;

public class DeleteAndEarn {

    public int deleteAndEarn(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int max = 0;
        for(int num : nums)
            if(max < num)
                max = num;

        int[] count = new int[max +1];

        for(int value : nums)
            count[value]++;

        int selectPrevious = 0;
        int didNotSelectPrevious = 0;
        for(int i = 1; i< count.length; i++){
            int selectCurrent = count[i]*i + didNotSelectPrevious;
            int didNotSelectCurrent = Math.max(selectPrevious, didNotSelectPrevious);

            selectPrevious = selectCurrent;
            didNotSelectPrevious = didNotSelectCurrent;
        }

        return Math.max(selectPrevious, didNotSelectPrevious);
    }

}
