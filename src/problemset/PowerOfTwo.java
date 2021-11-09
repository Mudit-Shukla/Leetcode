/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 09-11-2021
 *   Time: 21:39
 *   File: PowerOfTwo.java
 */

package problemset;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(checkPower3(6));
    }

    /**
     * Here in this logic IF THE NUMBER IS OF POWER 2 THERE COULD BE ONLY SINGLE 1 IN THE BINARY
     * FORMAT OF THE NUMBER AND IT HAS TO BE THE LEFTMOST BIT. WHEREAS IN (N-1)'s BINARY FORMAT
     * THE LEFTMOST BIT BAN NEVER BE 0. SO THE "BINARY AND" OPERATION WILL GIVE 0
     * @param n is the input
     * @return if the number os of the power of 2
     */

    public static boolean checkPower(int n){
        if(n <= 0)
            return false;
        else
            return (n & (n-1)) == 0;
    }

    /**
     * In this logic when we take 2's complement of a number, the number turns negative and the
     * number becomes same in the binary format when read frm the last and all other bits are
     * complement to each other. So the BINARY AND operation should return the original value.
     * @param n input value
     * @return if power of 2
     */

    public static boolean checkPower2(int n){
        if(n <= 0)
            return false;
        else
            return (n & (-n)) == n;
    }

    public static boolean checkPower3(int n){
        if(n <= 0)
            return false;
        while(n%2 == 0){
            n = n/2;
        }
        return (n == 1);
    }
}
