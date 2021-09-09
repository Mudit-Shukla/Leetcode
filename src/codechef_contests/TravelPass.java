/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 03-09-2021
 *   Time: 17:46
 *   File: TravelPass.java
 */

package codechef_contests;

import java.util.Scanner;

public class TravelPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i =0; i< testCases; i++){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int time = 0;
            for(int j =0; j< n; j++){
                if(s.charAt(j) == '0')
                    time += a;
                else
                    time += b;
            }

            System.out.println(time);
        }
    }
}
