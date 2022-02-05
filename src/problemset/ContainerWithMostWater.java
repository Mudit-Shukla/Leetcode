/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 05-02-2022
 *   Time: 15:44
 *   File: ContainerWithMostWater.java
 */

package problemset;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxVolume = Integer.MIN_VALUE;
        int start = 0;
        int end = height.length-1;
        while(start < end){
            maxVolume = Math.max(maxVolume, (end - start) * Math.min(height[start], height[end]));
            if(height[start] < height[end])
                start++;
            else
                end--;
        }
        return maxVolume;
    }

}
