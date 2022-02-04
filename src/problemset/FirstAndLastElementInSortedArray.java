/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 04-02-2022
 *   Time: 15:48
 *   File: FirstAndLastElementInSortedArray.java
 */

package problemset;

public class FirstAndLastElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {

        int start = 0;
        int last = nums.length-1;
        int firstIndex = -1;
        int lastIndex = -1;

        while(start <= last){
            int mid = start + (last-start)/2;
            if(nums[mid] == target)
                lastIndex = mid;
            if(nums[mid] <= target)
                start = mid+1;
            else
                last = mid-1;
        }

        start = 0;
        last = nums.length-1;
        while(start <= last){
            int mid = start + (last-start)/2;
            if(nums[mid] == target)
                firstIndex = mid;
            if(nums[mid] >= target)
                last = mid-1;
            else
                start = mid + 1;
        }

        return new int[]{firstIndex, lastIndex};
    }

}
