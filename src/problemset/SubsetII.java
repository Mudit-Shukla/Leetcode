/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 22-02-2022
 *   Time: 09:33
 *   File: SubsetII.java
 */

package problemset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetII {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        getSubsets(nums, result, nums.length, 0, new ArrayList<>());
        for(List<Integer> ele : result)
            System.out.println(ele);
    }

    public static void getSubsets(int[] nums, List<List<Integer>> result, int n, int index, List<Integer> subsequence){
        if(n == index){
            if(!result.contains(subsequence)){
                result.add(new ArrayList<>(subsequence));
            }
            return;
        }
        subsequence.add(nums[index]);
        getSubsets(nums, result, n, index+1, subsequence);
        subsequence.remove(subsequence.size()-1);
        getSubsets(nums, result, n, index+1, subsequence);
    }
}
