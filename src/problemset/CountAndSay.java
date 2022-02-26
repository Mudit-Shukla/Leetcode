/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 27-02-2022
 *   Time: 04:44
 *   File: CountAndSay.java
 */

package problemset;

public class CountAndSay {

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n){
        String baseCase = "1";
        for(int i = 1; i < n; i++){
            baseCase = getString(baseCase);
        }
        return baseCase;
    }

    public static String getString(String str){
        char ch = str.charAt(0);
        int count = 1;
        String result = "";
        for(int i = 1; i< str.length(); i++){
            if(str.charAt(i) == ch)
                count++;
            else{
                result += count;
                result += ch;
                count = 1;
                ch = str.charAt(i);
            }
        }

        result += count;
        result+= ch;
        return result;
    }
}
