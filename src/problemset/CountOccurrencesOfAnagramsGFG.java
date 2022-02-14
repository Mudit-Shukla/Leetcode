/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 15-02-2022
 *   Time: 01:23
 *   File: CountOccurencesOfAnagrams.java
 */

package problemset;

import java.util.Arrays;

public class CountOccurrencesOfAnagramsGFG {

    public static void main(String[] args) {
        System.out.println(searchAnagrams("forxxorfxdofr", "for"));
    }

    public static int searchAnagrams(String s1, String s2){
        int l1 = s1.length();
        int l2 = s2.length();

        int count = 0;

        int[] array1 = new int[26];
        int[] array2 = new int[26];
        for(int i = 0; i < l2; i++){
            array1[s1.charAt(i) - 'a']++ ;
            array2[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(array1, array2))
            count++;
        for(int i = l2; i < l1; i++){
            array1[s1.charAt(i - l2) - 'a']--;
            array1[s1.charAt(i) - 'a']++;
            if(Arrays.equals(array1, array2))
                count++;
        }

        return count;
    }
}
