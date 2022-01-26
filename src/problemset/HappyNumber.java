/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 26-01-2022
 *   Time: 12:06
 *   File: HappyNumber.java
 */

package problemset;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public boolean happyNumber(int number){
        Set<Integer> set = new HashSet<>();
        while(true){
            int sum = 0;
            while(number > 0){
                int digit = number % 10;
                sum = sum + digit * digit;
                number = number / 10;
            }
            if(sum == 1)
                return true;
            else if(set.contains(sum))
                return false;
            else{
                set.add(sum);
                number = sum;
            }
        }
    }
}
