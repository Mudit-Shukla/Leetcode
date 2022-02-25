/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 26-02-2022
 *   Time: 02:41
 *   File: Permutation.java
 */

package problemset;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        getPermutations(nums, 0, result);
        return result;
    }

    public static void getPermutations(int[] nums, int index, List<List<Integer>> result, List<Integer> permutation, boolean[] visited){
        if(index == nums.length){
            result.add(new ArrayList<>(permutation));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(!visited[i]){
                permutation.add(nums[i]);
                visited[i] = true;
                getPermutations(nums, index +1, result, permutation, visited);
                permutation.remove(permutation.size() - 1);
                visited[i] = false;
            }
        }
    }

    public static void getPermutations(int [] nums, int index, List<List<Integer>> result){
        if(index == nums.length){
            List<Integer> permutation = new ArrayList<>();
            for(int num : nums)
                permutation.add(num);
            result.add(new ArrayList<>(permutation));
            return;
        }
        for(int i = index; i < nums.length; i++){
            swap(i, index, nums);
            getPermutations(nums, index + 1, result);
            swap(i, index, nums);
        }
    }

    public static void swap(int i , int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
