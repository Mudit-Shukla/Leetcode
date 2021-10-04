/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 05-10-2021
 *   Time: 00:25
 *   File: MoveZeroes.java
 */

package problemset;

public class MoveZeroes {
    public static void main(String[] args) {
        int [] array = {0,1};
        moveZeroes(array);
    }

    public static void moveZeroes(int [] array){
        int j = 0;
        for(int i =0; i< array.length; i++){
            if(array[i] != 0){
                array[j] = array[i];
                ++j;
            }
        }
        for(int i = array.length-1; i >= j; i--)
            array[i] = 0;
        for(int i : array)
            System.out.print(i + " ");
    }
}
