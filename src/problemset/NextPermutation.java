/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 06-01-2022
 *   Time: 00:25
 *   File: NextPermutation.java
 */

package problemset;

public class NextPermutation {
    public static void main(String[] args) {
        nextPermutation(new int[]{1,2,3});
    }

    public static void nextPermutation(int[] array){
        if(array.length <= 1)
            return;
        int i = array.length -2;
        while( i >= 0 && array[i] >= array[i+1])
            i--;
        if(i >= 0){
            int j = array.length -1;
            while(array[j] <= array[i])
                j--;
            swap(array, i, j);
        }
        reverse(array, i+1, array.length-1);
        for (int num : array)
            System.out.print(num + " ");
    }

    public static void swap(int[] array, int i , int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void reverse(int [] array, int i, int j){
        while(i < j)
            swap(array, i++, j--);
    }
}
