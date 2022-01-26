/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 26-01-2022
 *   Time: 13:45
 *   File: LongetsPalindromicSubstring.java
 */

package problemset;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(longestPalindromicSubstring("babad"));
    }

    public static String longestPalindromicSubstring(String string){
        boolean[][] dp = new boolean[string.length()][string.length()];
        String maxString = "";
        for(int gap = 0; gap < dp.length; gap++){
            for(int i = 0, j = gap; j < dp.length; j++, i++){
                if(gap == 0){
                    dp[i][j] = true;
                }else if(gap == 1){
                    if(string.charAt(i) == string.charAt(j))
                        dp[i][j] = true;
                    else
                        dp[i][j] = false;
                }else{
                    if(string.charAt(i) == string.charAt(j) && dp[i+1][j-1])
                        dp[i][j] = true;
                    else
                        dp[i][j] = false;
                }
                if(dp[i][j])
                    if(maxString.length() <= j-i)
                        maxString = string.substring(i, j+1);
            }
        }
        return maxString;
    }
}
