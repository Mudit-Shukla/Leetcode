/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 25-08-2021
 *   Time: 22:45
 *   File: ReverseWordsInString.java
 */

package problemset;

public class ReverseWordsInString {
    public static void main(String[] args) {
        System.out.println(reverseWords("hello world"));

    }

    public static String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = s.length() - 1;
        int j;
        while (i >= 0) {
            if (s.charAt(i) == ' ')
                i--;
            else {
                j = i;
                while (i >= 0 && s.charAt(i) != ' ') {
                    i--;
                }
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(' ');
                }
                stringBuilder.append(s.substring(i+1, j+1));
            }
        }
        return stringBuilder.toString();
    }
}

