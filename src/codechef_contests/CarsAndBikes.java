/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 19-09-2021
 *   Time: 22:02
 *   File: CarsAndBikes.java
 */

package codechef_contests;

import java.util.Scanner;

public class CarsAndBikes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i =0; i< testCases; i++){
            int n = sc.nextInt();
            if(n%4 == 0){
                System.out.println("NO");
            }else
                System.out.println("YES");
        }
    }
}
