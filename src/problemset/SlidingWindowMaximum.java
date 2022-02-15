/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 15-02-2022
 *   Time: 02:04
 *   File: SlidingWindowMaximum.java
 */

package problemset;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int[] array = {1,3,-1,-3,5,3,6,7};
        int [] result = (getSlidingWindowMaximum(array, 3));
        for(int ele : result)
            System.out.println(ele);
    }

    public static int[] getSlidingWindowMaximum(int[] nums, int k){
        if(k > nums.length)
            return new int[0];

        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];
        int index = 0;
        for(int i = 0; i < k; i++){
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i])
                deque.pollLast();
            deque.add(i);
        }

        result[index++] = nums[deque.getFirst()];

        for(int i = k; i < nums.length; i++){
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1)
                deque.pollFirst();
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i])
                deque.pollLast();
            deque.add(i);
            result[index++] = nums[deque.getFirst()];
        }
        return result;
    }

    /**
     *
     * This problem can also be solved by using priority queue of size k (Collections.reverseOrder() )
     *
     */
}
