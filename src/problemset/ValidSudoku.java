/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 29-09-2021
 *   Time: 00:56
 *   File: ValidSudoku.java
 */

package problemset;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        String[][] array = {{"5","3",".",".","7",".",".",".","."}
                            ,{"6",".",".","1","9","5",".",".","."}
                            ,{".","9","8",".",".",".",".","6","."}
                            ,{"8",".",".",".","6",".",".",".","3"}
                            ,{"4",".",".","8",".","3",".",".","1"}
                            ,{"7",".",".",".","2",".",".",".","6"}
                            ,{".","6",".",".",".",".","2","8","."}
                            ,{".",".",".","4","1","9",".",".","5"}
                            ,{".",".",".",".","8",".",".","7","9"}};

        Set<String> set = new HashSet<>();
        for(int i =0; i< array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                if(array[i][j].equals("."))
                    continue;
                // WE HAVE TO MAKE A STRING OF FORMAT LIKE THIS - ARRAY[I][J] -
                if(!set.add(i+array[i][j]) || !set.add(array[i][j]+j) || !set.add((i/3) + array[i][j] + (j/3))) {
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);

    }
}
