/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 16-01-2022
 *   Time: 16:46
 *   File: LongestSubstring.java
 */

package problemset;

import java.util.*;

public class LongestSubstring {
    public int longestSubstring(String s){
        int count = 0;
        int leftPointer = 0;
        int rightPointer = 0;

        int maxCount = count;
        Set<Character> set = new HashSet<>();
        while (leftPointer <= rightPointer && rightPointer < s.length()){
            if(!set.contains(s.charAt(rightPointer))) {
                set.add(s.charAt(rightPointer));
                rightPointer++;
                count = rightPointer - leftPointer + 1;
                maxCount = Math.max(count, maxCount);
            }
            else{
                while(true){
                    if(s.charAt(rightPointer) != s.charAt(leftPointer)){
                        set.remove(s.charAt(leftPointer));
                        leftPointer++;
                    }else{
                        set.add(s.charAt(rightPointer));
                        leftPointer++;
                        rightPointer++;
                        break;
                    }
                }
            }
        }

        return maxCount;
    }
}
