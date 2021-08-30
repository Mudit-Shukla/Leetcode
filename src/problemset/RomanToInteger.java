/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 30-08-2021
 *   Time: 22:05
 *   File: RomanToInteger.java
 */

package problemset;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(convertRoman("IV"));
    }

    public static int convertRoman(String s){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        int result = 0;
        int previous = 0;
        for(int i =s.length() - 1; i >= 0; i--){
            int val = (hashMap.get(s.charAt(i)));
            if(val >= previous)
                result += val;
            else
                result -= val;
            previous = val;
        }
        return result;
    }
}
