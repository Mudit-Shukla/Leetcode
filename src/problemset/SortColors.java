/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 29-01-2022
 *   Time: 15:37
 *   File: SortColors.java
 */

package problemset;

public class SortColors {

    public void sortColors(int[] nums) {
        for(int i = 0; i< nums.length; i++){
            for(int j = 0; j < nums.length - i -1; j++){
                if(nums[j+1] < nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
