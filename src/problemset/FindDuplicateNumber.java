/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 08-01-2022
 *   Time: 02:59
 *   File: FindDuplicateNumber.java
 */

package problemset;

public class FindDuplicateNumber {

    public int findDuplicate(int[] nums){
        int slowPointer = nums[0];
        int fastPointer = nums[0];

        do{
            slowPointer = nums[slowPointer];
            fastPointer = nums[nums[fastPointer]];
        }while (slowPointer != fastPointer);

        fastPointer = nums[0];
        while(slowPointer != fastPointer){
            slowPointer = nums[slowPointer];
            fastPointer = nums[fastPointer];
        }

        return fastPointer;
    }
}
