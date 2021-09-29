/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 30-09-2021
 *   Time: 00:48
 *   File: RansomNote.java
 */

package problemset;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        String ransom = "a";
        String magazine = "b";
        boolean result = true;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char c : ransom.toCharArray()){
            if(!map1.containsKey(c))
                map1.put(c, 1);
            else
                map1.put(c, map1.get(c)+1);
        }
        for(char c : magazine.toCharArray()){
            if(!map2.containsKey(c))
                map2.put(c, 1);
            else
                map2.put(c, map2.get(c)+1);
        }
        for(Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || entry.getValue() > map2.get(entry.getKey()))
                result = false;
        }
        System.out.println(result);
    }
}
