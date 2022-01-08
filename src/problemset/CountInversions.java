/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 08-01-2022
 *   Time: 13:52
 *   File: RepeatingAndMissngElement.java
 */

package problemset;

public class CountInversions {

    public int countInversion(int [] array){

        int [] temp = new int[array.length];
        return partition(array, temp, 0, array.length-1);
    }

    public int partition(int[] array, int [] temp, int start, int last){
        int mid, inversionCount = 0;
        while(start < last){
            mid = (last+start)/2;
            inversionCount += partition(array, temp, start, mid);
            inversionCount += partition(array, temp, mid+1, last);
            inversionCount += merge(array, temp, start, mid+1, last);
        }

        return inversionCount;
    }

    public int merge(int [] array, int [] temp, int start, int mid, int last){
        int i = start;
        int j = mid;
        int k = start;
        int inversionCount = 0;

        while ( i < mid && j < last){
            if(array[i] <= array[j]){
                temp[k] = array[i];
                i++;
            }else{
                temp[k] = array[j];
                j++;
                inversionCount = inversionCount + mid-i;
            }
            k++;
        }

        while(i < mid){
            temp[k] = array[i];
            i++;
            k++;
        }
        while(j < last){
            temp[k] = array[j];
            k++;
            j++;
        }

        for(i = 0; i< array.length; i++)
            array[i] = temp[i];

        return inversionCount;
    }


}
