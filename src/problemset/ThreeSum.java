/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 13-01-2022
 *   Time: 19:52
 *   File: FourSum.java
 */

package problemset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] arr){
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i< arr.length-2; i++){
            if(i == 0 || (arr[i] != arr[i-1])){
                int j = i+1;
                int k = arr.length-1;
                while(j < k){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        List<Integer> res = new ArrayList<>();
                        res.add(arr[i]);
                        res.add(arr[j]);
                        res.add(arr[k]);
                        answer.add(res);
                        while (j < k && arr[j] == arr[j+1])
                            j++;
                        while (j < k && arr[k] == arr[k-1])
                            k--;
                        j++;
                        k--;
                    }else if(arr[i] + arr[j] + arr[k] < 0)
                        j++;
                    else
                        k--;
                }
            }
        }
        return answer;
    }
}
