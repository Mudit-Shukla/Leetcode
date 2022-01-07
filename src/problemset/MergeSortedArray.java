/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 20-09-2021
 *   Time: 18:15
 *   File: MergeSortedArray.java
 */

package problemset;

import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = {1,0,0,0};
        int[] array2 = {2,4,6};

//        int m = array1.length-array2.length;
//        int n = array2.length;
//
//        int k = 0;
//        for(int i = m; i< m+n; i++){
//            array1[i] = array2[k];
//            k++;
//        }
//
//        Arrays.sort(array1);

        int[] answer = merge(array1, array2);
        for(int num : array1)
            System.out.print(num + " ");

    }

    public static int[] merge(int[] nums1, int[] nums2){
        int last = nums1.length-1;
        int end2 = nums2.length-1;
        int end1 = last - end2 -1;
        while(end1 >= 0 && end2 >= 0){
            nums1[last--] = nums1[end1] > nums2[end2] ? nums1[end1--] : nums2[end2--];
        }

        while(end2 >= 0)
            nums1[last--] = nums2[end2--];

        return nums1;
    }
}
