/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 27-02-2022
 *   Time: 12:24
 *   File: FindMinimumInSortedArray.java
 */

package problemset;

public class FindMinimumInSortedArray {

    public int findMin(int[] nums) {
        return binarySearch(nums);
    }

    public int binarySearch(int[] nums){
        int start = 0;
        int end = nums.length -1;
        if(nums[start] <= nums[end])
            return nums[start];
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid > 0 && nums[mid] < nums[mid-1])
                return nums[mid];
            if(mid < nums.length - 1 && nums[mid] > nums[mid+1])
                return nums[mid+1];
            if(nums[mid] > nums[0])
                start = mid;
            else
                end = mid;
        }
        return -1;
    }

}
