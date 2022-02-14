/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 15-02-2022
 *   Time: 01:46
 *   File: FindAllAnagramsInStringLeetcode.java
 */

package problemset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInStringLeetcode {

    public List<Integer> findAnagrams(String s1, String s2) {
        List<Integer> result = new ArrayList<>();
        int[] array1 = new int[26];
        int[] array2 = new int[26];

        int l1 = s1.length();
        int l2 = s2.length();

        if(l1 < l2)
            return result;

        for(int i = 0; i< l2; i++){
            array1[s1.charAt(i) - 'a']++;
            array2[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(array1, array2))
            result.add(0);
        for(int i = l2; i < l1; i++){
            array1[s1.charAt(i - l2) - 'a']--;
            array1[s1.charAt(i) - 'a']++;
            if(Arrays.equals(array1, array2))
                result.add(i - l2);
        }
        return result;
    }
}
