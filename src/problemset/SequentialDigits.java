/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 23-01-2022
 *   Time: 15:36
 *   File: SequentialDigits.java
 */

package problemset;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {

    public static void main(String[] args) {
        List<Integer> answer = getSequentialDigit(100, 300);
        for(int num : answer)
            System.out.print(num + "  ");
    }

    public static List<Integer> getSequentialDigit(int low, int high){

        List<Integer> result = new ArrayList<>();
        int current = 1;
        int increment = 11;
        int start = 1;
        int totalNumbersWithSameNumberOfDigits = 8;

        while(current < high){
            for(int i = 0; i < totalNumbersWithSameNumberOfDigits; i++){
                current = current + increment;
                if(current >= low && current <= high)
                    result.add(current);
            }
            increment = (increment * 10) + 1;
            start = (start * 10) + 10 - totalNumbersWithSameNumberOfDigits;
            current = start;
            --totalNumbersWithSameNumberOfDigits;
        }
        return result;
    }
}
