/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 29-09-2021
 *   Time: 21:34
 *   File: FirstUniqueCharacter.java
 */

package problemset;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "AABB";
        Map<Character, Integer> map = new HashMap<>();
        int index = Integer.MAX_VALUE;
        for(Character c : s.toCharArray()){
            if(!map.containsKey(c))
                map.put(c, 1);
            else
                map.put(c, map.get(c)+1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                char c = entry.getKey();
                if(index > s.indexOf(c))
                    index = s.indexOf(c);
            }
        }
        if(index == Integer.MAX_VALUE)
            System.out.println(-1);
        System.out.println(index);
    }
}
