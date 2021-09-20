/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 20-09-2021
 *   Time: 18:15
 *   File: MergeSortedArray.java
 */

package problemset;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = {1,4,5,0,0,0};
        int[] array2 = {2,4,6};

        int m = array1.length-array2.length;
        int n = array2.length;

        int k = 0;
        for(int i = m; i< m+n; i++){
            array1[i] = array2[k];
            k++;
        }

        Arrays.sort(array1);

    }
}
