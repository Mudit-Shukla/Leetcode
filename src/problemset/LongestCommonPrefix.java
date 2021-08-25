/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 25-08-2021
 *   Time: 12:10
 *   File: LongestCommonPrefix.java
 */

package problemset;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] array = {" flight, flew"};
        System.out.println(findLongestPrefix(array));
    }

    public static String findLongestPrefix(String[] array){
        String longestPrefix = "";
        int len = 201;
        for(int i = 0; i< array.length; i++)
            if(array[i].length() < len)
                len = array[i].length();
        for (int i = 0; i< len; i++){
            for(int j = 1; j< array.length; j++){
                if(array[j].charAt(i) != array[j-1].charAt(i))
                    return longestPrefix;
            }
            longestPrefix = array[0].substring(0, i+1);
        }

        return longestPrefix;
    }
}






