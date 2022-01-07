/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 07-01-2022
 *   Time: 02:47
 *   File: MergeOverlappingIntervals.java
 */

package problemset;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeOverlappingIntervals {

    public int[][] merge(int[][] interval){
        Arrays.sort(interval, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        Stack<int[]> stack = new Stack<>();
        stack.push(interval[0]);
        for(int i = 1; i< interval.length; i++){
            if(interval[i][0] <= stack.peek()[1]){
                int[] topOfStack = stack.pop();
                stack.push(new int[]{topOfStack[0], Math.max(topOfStack[1], interval[i][1])});
            }
            else{
                stack.push(new int[]{interval[i][0], interval[i][1]});
            }
        }
        int sizeOfStack = stack.size();
        int[][] resultArray = new int[sizeOfStack][2];
        for(int i = sizeOfStack-1; i>= 0; i--){
            resultArray[i] = new int[]{stack.peek()[0], stack.peek()[1]};
            stack.pop();
        }
        return resultArray;
    }
}
