/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 03-09-2021
 *   Time: 16:42
 *   File: AirlineRestrictions.java
 */

package codechef_contests;

import java.util.Scanner;

public class AirlineRestrictions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i =0; i< testCases; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();

            if(a <= e && b+c <= d)
                System.out.println("YES");
            else if(b <= e && a+c <= d)
                System.out.println("YES");
            else if(c <= e && b+a <= d)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
