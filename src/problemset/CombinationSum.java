/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 23-02-2022
 *   Time: 00:53
 *   File: CombinationSum.java
 */

package problemset;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        int[] array = {2,3,6,7};
        int target = 7;
        List<List<Integer>> result = new ArrayList<>();
        getCombinations(array, 0, array.length, target, result, new ArrayList<>());
        for(List<Integer> list : result)
            System.out.println(list);
    }

    public static void getCombinations(int[] array, int index, int n, int target, List<List<Integer>> result, List<Integer>combination){
        if(index == n){
            if(target == 0){
                result.add(new ArrayList<>(combination));
            }
            return;
        }
        if(array[index] <= target){
            combination.add(array[index]);
            getCombinations(array, index, n, target - array[index], result, combination);
            combination.remove(combination.size() - 1);
        }
        getCombinations(array, index+1, n, target, result, combination);
    }
}
