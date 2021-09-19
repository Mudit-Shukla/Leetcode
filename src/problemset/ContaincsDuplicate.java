/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 19-09-2021
 *   Time: 19:08
 *   File: ContaincsDuplicate.java
 */

package problemset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContaincsDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for(int i= 0; i< array.length; i++){
            array[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer number : array){
            if(map.containsKey(number))
                map.put(number, map.get(number) + 1);
            else
                map.put(number, 1);
        }

        boolean result = false;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > 1){
                result = true;
            }
        }
    }
}
