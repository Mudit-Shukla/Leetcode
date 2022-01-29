/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 21-09-2021
 *   Time: 18:07
 *   File: IntersectionTowArray.java
 */

package problemset;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionTwoArray {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 2, 1};
        int[] num2 = {2, 2};

        Arrays.sort(num1);
        Arrays.sort(num2);

        ArrayList<Integer> list = new ArrayList<>();
        int c = 0;
        int d = 0;

        while(c < num1.length && d < num2.length){
            if(num1[c] == num2[d]){
                list.add(num1[c]);
                c++;
                d++;
            }else if(num1[c] < num2[d])
                c++;
            else
                d++;
        }

        //  ORDER(n) TIME COMPLEXITY AND ORDER(2n) SPACE COMPLEXITY

//        int[] array = new int[list.size()];
//        for(int i =0; i< list.size(); i++)
//            array[i] = list.get(i);
//
//        Set<Integer> set1 = new HashSet<Integer>();
//        for (Integer n : nums1) set1.add(n);
//        Set<Integer> set2 = new HashSet<Integer>();
//        for (Integer n : nums2) set2.add(n);
//
//        set1.retainAll(set2);
//
//        int [] result = new int[set1.size()];
//        int k = 0;
//        for (int num : set1)
//            result[k++] = num;
//        return result;
    }
}
