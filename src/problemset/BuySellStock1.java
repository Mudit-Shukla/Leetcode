/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 21-09-2021
 *   Time: 19:17
 *   File: BuySellStock1.java
 */

package problemset;

public class BuySellStock1 {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        int minPrice =  Integer.MAX_VALUE;
        int profit = 0;
        for(int price : prices) {
            if (price < minPrice)
                minPrice = price;
            else if (profit < (price - minPrice))
                profit = price - minPrice;
        }
        System.out.println(profit);
    }
}
