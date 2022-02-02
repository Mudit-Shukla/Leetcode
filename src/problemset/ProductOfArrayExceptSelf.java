/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 03-02-2022
 *   Time: 00:53
 *   File: ProductOfArrayExceptSelf.java
 */

package problemset;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] right = new int[nums.length];
        int[] left = new int[nums.length];

        right[nums.length-1] = 1;
        for(int i = nums.length-2; i>= 0; i--)
            right[i] = nums[i+1] * right[i+1];
        left[0] = 1;
        for(int i = 1; i< nums.length; i++)
            left[i] = left[i-1] * nums[i-1];

        for(int i = 0; i< nums.length; i++){
            nums[i] = left[i] * right[i];
        }
        return nums;
    }

}
