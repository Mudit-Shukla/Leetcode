/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 07-10-2021
 *   Time: 03:59
 *   File: KeyPadCombinations.java
 */

package problemset;

import java.util.ArrayList;
import java.util.List;

public class KeyPadCombinations {

    static boolean flag = true;
    static String [] array = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = findKeyComb("23");
        for(String ele : list)
            System.out.println(ele);
        System.out.println(list.size());

    }

    public static ArrayList<String> findKeyComb(String str){

        if(str.length() == 0 && flag)
            return new ArrayList<String>();
        flag = false;

        if(str.length() == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return  list;
        }

        char ch = str.charAt(0);
        String remainingString = str.substring(1);
        ArrayList<String> recursionResult = findKeyComb(remainingString);
        ArrayList<String> mainResult = new ArrayList<>();

        String letters = array[Integer.parseInt(ch + "")-1];
        for(int i =0; i< letters.length(); i++){
            char c = letters.charAt(i);
            for(String string : recursionResult){
                mainResult.add(c + string);
            }
        }

        if(mainResult.size() == 1)
            return null;

        return mainResult;

    }
}
