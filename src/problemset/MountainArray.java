/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 25-01-2022
 *   Time: 11:49
 *   File: MountainArray.java
 */

package problemset;

public class MountainArray {

    public static void main(String[] args) {
        int [] array = {1,3,2};
        System.out.println(mountainArray(array));
    }

    public static boolean mountainArray(int [] array){
        if(array.length < 3)
            return false;
        int increasingCount = 0;
        int decreasingCount = 0;
        for(int i = 0; i< array.length-2; i++)
            if(array[i] < array[i+1])
                increasingCount++;
            else break;
        for(int i = array.length-1; i>0; i--)
            if(array[i] < array[i-1])
                decreasingCount++;
            else break;
        if(increasingCount == 0 || decreasingCount == 0)
            return false;
        if(array.length - decreasingCount - 1 == increasingCount)
            return true;
        return false;
    }
}
