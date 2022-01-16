/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 14-01-2022
 *   Time: 13:01
 *   File: FourSum.java
 */

package problemset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] arr, int target){
        Arrays.sort(arr);
        List<List<Integer>> answer = new ArrayList<>();
        for(int i = 0; i< arr.length-1; i++){
            for(int j = i+1; j< arr.length; j++){
                int front = j+1;
                int back = arr.length-1;
                while(front < back){
                    if(arr[i] + arr[j] + arr[front] + arr[back] < target)
                        front++;
                    else if(arr[i] + arr[j] + arr[front] + arr[back] > target)
                        back--;
                    else{
                        List<Integer> res = new ArrayList<>();
                        res.add(arr[i]);
                        res.add(arr[j]);
                        res.add(arr[front]);
                        res.add(arr[back]);
                        answer.add(res);

                        while (front+1 < arr.length && arr[front]== arr[front+1]) front++;
                        while (back-1 > 0 && arr[back]== arr[back-1]) back--;

                        front++;
                        back--;

                    }
                }
                while (j+1 < arr.length && arr[j] == arr[j+1]) ++j;
            }

            while (i+1 < arr.length && arr[i] == arr[i+1]) ++i;
        }
        return answer;
    }
}
