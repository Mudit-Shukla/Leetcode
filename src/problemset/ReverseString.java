/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 25-08-2021
 *   Time: 12:01
 *   File: ReverseString.java
 */

package problemset;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("hello".toCharArray()));
    }

    public static char[] reverseString(char[] string){
        int i =0;
        int j = string.length - 1;
        while(i < j){
            char temp = string[i];
            string[i] = string[j];
            string[j] = temp;
            i++; j--;
        }
        return string;
    }
}
