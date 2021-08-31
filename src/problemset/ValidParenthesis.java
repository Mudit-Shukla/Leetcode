/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 30-08-2021
 *   Time: 23:15
 *   File: ValidParenthesis.java
 */

package problemset;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(checkValidity(")))()((("));
    }

    public static boolean checkValidity(String s){
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        char previous;
        for(int i =1; i< s.length(); i++){
            if(!stack.isEmpty())
                previous = stack.peek();
            else
                previous = 'A';
            switch (s.charAt(i)){
                case '{':
                    stack.push('{');
                    break;
                case '}':
                    if(previous == '{')
                        stack.pop();
                    else
                        stack.push('}');
                    break;
                case '(':
                    stack.push('(');
                    break;
                case ')':
                    if(previous == '(')
                        stack.pop();
                    else
                        stack.push(')');
                    break;
                case '[':
                    stack.push('[');
                    break;
                case ']':
                    if(previous == '[')
                        stack.pop();
                    else
                        stack.push(']');
                    break;
            }
        }

        if(stack.isEmpty())
            return true;
        return false;
    }
}
