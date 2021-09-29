/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 30-09-2021
 *   Time: 02:23
 *   File: Anagram.java
 */

package problemset;

public class Anagram {
    public static void main(String[] args) {

        /**
         * Brute force approach is the iterate through both the strings and check if each and every character
         * exists in each other. We also have to use a visited array to track the visited character
         */

        /**
         * One Approach is sort both the string and compare if equal
         */

        /**
         * Second Approach is use Hash Map but it is less efficient
         */

        /**
         * Best approach using Array
         */

        String s1 = "abb";
        String s2 = "abb";
        if(s1.length() != s2.length())
            //return false
            System.out.println(false);
        int[] array = new int[26];
        for(char c : s1.toCharArray()){
            int index = (int) c - (int) 'a';
            array[index] ++;
        }
        for(char c : s2.toCharArray()){
            int index = (int) c -(int) 'a';
            array[index] --;
        }

        for(int i = 0; i< array.length; i++)
            if(array[i] != 0) {
                //return false;
                System.out.println(false);
                break;
            }
        System.out.println(true);
    }
}
