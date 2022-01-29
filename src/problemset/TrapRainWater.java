/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 29-01-2022
 *   Time: 15:40
 *   File: TrapRainWater.java
 */

package problemset;

public class TrapRainWater {


    /**
     *
     * BRUTE FORCE APPROACH WOULD BE TO CALCULATE MAX LEFT AND MAX RIGHT FOR EACH INDEX TIME COMPLEXITY WOULD BE O(n^2)
     *
     * BETTER APPROACH WOULD BE TO KEEP SUFFIX AND PREFIX ARRAYS TO KEEP IN VALUE OF MAX LEFT AND MAX RIGHT FOR
     * EACH INDEX TIME COMPLEXITY WOULD BE O(n) BUT SPACE COMPLEXITY WOULD BE O(n)
     *
     * OPTIMAL SOLUTION IS TO USE TWO POINTER
     *
     */

    public int trap(int[] height) {
        int maxLeft = 0;
        int maxRight = 0;
        int result = 0;
        int left = 0;
        int right = height.length-1;

        if(height.length < 3)
            return result;

        while(left <= right){
            if(height[left] <= height[right]){
                if(maxLeft <= height[left])
                    maxLeft = height[left];
                else
                    result += maxLeft-height[left];
                left++;
            }else{
                if(maxRight <= height[right])
                    maxRight = height[right];
                else
                    result += maxRight - height[right];
                right--;
            }
        }

        return result;
    }
}
