/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 09-11-2021
 *   Time: 22:01
 *   File: IsSubsequence.java
 */

package problemset;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(checkSubsequence("abc", "axybzxcfy"));
    }

    public static boolean checkSubsequence(String s1, String s2){
        int i = 0,j = 0;
        while(i < s1.length() && j < s2.length()){
            if(s1.charAt(i) == s2.charAt(j))
                i++;
            j++;
        }
        return i == s1.length();
    }
}
