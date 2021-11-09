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
        System.out.println(numsDecodeHelper("2101"));
    }

    public static int numsDecode(String str){
        return 0;
    }

    public static int numsDecodeHelper(String str){
        int[] dp = new int[str.length()];
        dp[0] = 1;
        for(int i =1; i< dp.length; i++){
            if(str.charAt(i-1) == '0' && str.charAt(i) == '0')
                dp[i] = 0;
            else if(str.charAt(i-1) == '0' && str.charAt(i) != '0')
                dp[i] = dp[i-1];
            else if(str.charAt(i-1) != '0' && str.charAt(i) == '0'){

//                if(str.charAt(i-1) == '1' || str.charAt(i-1) == '2') {
//                    if (i >= 2)
//                        dp[i] = dp[i - 2] + dp[i - 1];
//                    else
//                        dp[i] = dp[i - 1] + 1;
//                }
//                else
//                    dp[i] = 0;
                if(str.charAt(i-1) == '1' || str.charAt(i-1) == '2')
                    dp[i] = dp[i-1] + i >= 2 ? dp[i-2] : 1;
                else
                    dp[i] = 0;

            }else{
                String s1 = str.substring(i-1, i+1);
                int value = Integer.parseInt(s1);
                if(value < 27)
                    if(i >= 2)
                        dp[i] = dp[i-2] + dp[i-1];
                    else
                        dp[i] = dp[i-1] + 1;
                else
                    dp[i] = dp[i-1];
            }
        }
        return dp[dp.length-1];
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
