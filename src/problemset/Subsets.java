/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 22-02-2022
 *   Time: 08:41
 *   File: Subsets.java
 */

package problemset;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subsequence = new ArrayList<>();
        getSubsets(nums, result, 3, subsequence, 0);
        for(List<Integer> ele : result)
            System.out.println(ele);
    }

    public static void getSubsets(int[] nums, List<List<Integer>> result, int n,List<Integer> subsequence, int index){
        if(index == n){
            result.add(new ArrayList<>(subsequence));
            return;
        }
        subsequence.add(nums[index]);
        getSubsets(nums, result, n, subsequence, index+1);
        subsequence.remove(subsequence.size()-1);
        getSubsets(nums, result, n, subsequence, index+1);
    }
}
