/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 29-09-2021
 *   Time: 11:44
 *   File: CoinChange.java
 */

package problemset;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {

        int [] coins = {1,2,5};
        int amount = 11;
        int[] array = new int[amount+1];
        Arrays.fill(array,Integer.MAX_VALUE);
        array[0] = 0;

        for(int i =1; i< array.length; i++){
            for(int coin : coins){
                if(coin <= i && array[i-coin] != Integer.MAX_VALUE){
                    array[i] = Math.min(array[i-coin]+1, array[i]);
                }
            }
        }
//        array[amount] > amount ?  : array[amount];
        System.out.println(array[amount]);
    }
}
