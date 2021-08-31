/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 31-08-2021
 *   Time: 22:55
 *   File: MakeParenthesisValid.java
 */

package problemset;

import java.util.Stack;

public class MakeParenthesisValid {
    public static void main(String[] args) {
        System.out.println(returnCount("()))(("));
    }

    public static int returnCount(String s){
        int count = 0;
        if(s.length() == 0)
            return count;
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i =1; i< s.length(); i++){
            if(!stack.isEmpty() && stack.peek() == '(' && s.charAt(i) == ')')
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        while(!stack.isEmpty()){
            count = count +1;
            stack.pop();
        }
        return count;
    }
}
