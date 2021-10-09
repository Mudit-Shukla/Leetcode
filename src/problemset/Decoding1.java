/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 09-10-2021
 *   Time: 14:53
 *   File: Decoding1.java
 */

package problemset;

import java.util.ArrayList;
import java.util.List;

public class Decoding1 {
    static int count = 0;
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        decoding("27", "");
        System.out.println(count);
    }

    public static int numsDecode(String str){
        return 0;
    }

    public static void decoding(String string, String answer){
        if(string.length() == 0){
            ++count;
            System.out.println(answer);
        }else if(string.length() == 1){
            if(string.charAt(0) == '0')
                return;
            else{
                int digit = Integer.parseInt(string.charAt(0) + "");
                char code = (char) (digit + 'a' - 1);
                answer = answer + code;
                ++count;
                System.out.println(answer);
            }
        }else {
            char ch = string.charAt(0);
            if (ch == '0')
                return;
            String remaining = string.substring(1);
            int digit = Integer.parseInt(ch + "");
            char code = (char) (digit + 'a' - 1);
            decoding(remaining, answer + code);
            String s1 = string.substring(0, 2);
            String s2 = string.substring(2);
            int value = Integer.parseInt(s1);
            if (value < 27) {
                char codedVal = (char) (value + 'a' - 1);
                decoding(s2, answer + codedVal);
            }
        }
    }
}
