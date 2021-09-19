/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 19-09-2021
 *   Time: 22:16
 *   File: FakeGCD.java
 */

package codechef_contests;

import java.util.Scanner;

public class FakeGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i =0; i< testCases; i++){
            int n = sc.nextInt();
            for(int j = 1; j <= n; j++){
                System.out.print(j + " ");
            }
        }
    }
}
