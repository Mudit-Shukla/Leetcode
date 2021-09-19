/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 19-09-2021
 *   Time: 19:21
 *   File: MaxSubArray.java
 */

package problemset;

import java.util.Scanner;

public class MaxSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for(int i =0; i< array.length; i++){
            array[i] = sc.nextInt();
        }
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =0; i< array.length; i++){
            sum = sum + array[i];
            if(maxSum < sum)
                maxSum = sum;
            if(sum < 0)
                sum = 0;
        }

        // return sum;
    }
}
