/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 24-08-2021
 *   Time: 23:39
 *   File: Question50.java
 */

package problemset;

public class Question50 {
    public static void main(String[] args) {
        System.out.println(myPow(2.0, -2));

    }

    public static double myPow(double x,int n){
        double answer = 1.0;
        long number = n;
        if(number < 0)
            number *= -1;
        while(number > 0){
            if(number % 2 == 0){
                x = x*x;
                number = number/2;
            }else{
                answer = answer * x;
                number = number-1;
            }
        }

        if(n < 0)
            return 1/answer;
        return answer;
    }
}
