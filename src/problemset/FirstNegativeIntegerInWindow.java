/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 10-02-2022
 *   Time: 19:39
 *   File: FirstNegativeIntegerInWindow.java
 */

package problemset;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeIntegerInWindow {

    public static long[] getFirstNegative(long[] nums, int k){

        long[] result = new long[nums.length - k + 1];
        int index = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i< k; i++)
            if(nums[i] < 0)
                queue.add(i);
        for(int i = k; i< nums.length; i++){
            if(!queue.isEmpty())
                result[index++] = nums[queue.poll()];
            else
                result[index++] = 0;
            while (!queue.isEmpty() && queue.peek() < i-k+1)
                queue.poll();
            if(nums[i] < 0)
                queue.add(i);
        }
        if(!queue.isEmpty())
            result[index] = nums[queue.poll()];
        else
            result[index] = 0;

        return result;
    }
}
