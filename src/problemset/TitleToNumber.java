/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 23-02-2022
 *   Time: 00:50
 *   File: TitleToNumber.java
 */

package problemset;

public class TitleToNumber {

    public int titleToNumber(String columnTitle) {
        int answer = 0;
        for(int i = 0; i < columnTitle.length(); i++){
            answer = answer * 26;
            answer = answer + columnTitle.charAt(i)-'A' + 1;
        }
        return answer;
    }

}
