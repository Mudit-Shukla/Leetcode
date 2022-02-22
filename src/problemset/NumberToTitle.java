/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 23-02-2022
 *   Time: 00:51
 *   File: NumberToTile.java
 */

package problemset;

public class NumberToTitle {

    public String convertToTitle(int columnNumber) {
        String result = "";
        while(columnNumber > 0){
            int digit = (columnNumber-1) % 26;
            char c = (char) ((int) 'A' + digit);
            result = c + result;
            columnNumber = (columnNumber - 1) / 26;
        }
        return result;
    }

}
