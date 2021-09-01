/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 01-09-2021
 *   Time: 19:03
 *   File: IntegerToRoman.java
 */

package problemset;

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(convert(1994));
    }

    public static String convert(int num){
        StringBuilder stringBuilder = new StringBuilder();
        String[] array = {"M","CM", "D", "CD", "C", "XC", "L", "XL", "X","IX", "V","IV","I"};
        int[] array1 = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for(int i =0; i< array1.length; i++){
            while(num >= array1[i]){
                stringBuilder.append(array[i]);
                num = num - array1[i];
            }
        }
        return stringBuilder.toString();
    }
}
