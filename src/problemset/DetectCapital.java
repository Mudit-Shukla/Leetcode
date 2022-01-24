/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 24-01-2022
 *   Time: 16:54
 *   File: DetectCapital.java
 */

package problemset;

public class DetectCapital {

    public boolean detectCapitalUse(String word) {
        if(word.length() <= 1)
            return true;
        if(word.toUpperCase().equals(word))
            return true;
        if(word.substring(1).toLowerCase().equals(word.substring(1)))
            return true;
        return false;
    }
}
