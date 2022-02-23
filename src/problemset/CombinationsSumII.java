/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 23-02-2022
 *   Time: 01:17
 *   File: CombinationsSumII.java
 */

package problemset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationsSumII {

    public static void main(String[] args) {
        int[] array = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int target = 30;
        Arrays.sort(array);
        List<List<Integer>> result = new ArrayList<>();
        getCombinations(array, array.length, target, 0, result, new ArrayList<>());
        for(List<Integer> list : result)
            System.out.println(list);
    }

    public static void getCombinations1(int[] array, int n, int target, int index, List<List<Integer>> result, List<Integer> combination){
        if(index == n){
            if(target == 0 && !result.contains(combination)){
                result.add(new ArrayList<>(combination));
            }
            return;
        }
        if(array[index] <= target){
            combination.add(array[index]);
            getCombinations(array, n, target-array[index], index+1, result, combination);
            combination.remove(combination.size()-1);
        }
        getCombinations(array, n, target, index+1, result, combination);
    }


    /**
     * OPTIMISED APPROACH
     * THE ABOVE RECURSIVE APPROACH GIVES TLE
     */

    public static void getCombinations(int[] array, int n, int target, int index, List<List<Integer>> result, List<Integer> combination){

        if(target == 0){
            result.add(new ArrayList<>(combination));
        }
        for(int i = index; i < n; i++){
            if( i > index && array[i] == array[i-1])
                continue;
            if(target - array[i] < 0)
                break;
            combination.add(array[i]);
            getCombinations(array, n, target - array[i], i + 1, result, combination);
            combination.remove(combination.size() - 1);
        }
    }
}
