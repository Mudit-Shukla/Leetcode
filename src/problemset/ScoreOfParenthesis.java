/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 30-08-2021
 *   Time: 00:50
 *   File: ScoreOfParenthesis.java
 */

package problemset;

import java.util.Stack;

public class ScoreOfParenthesis {
    public static void main(String[] args) {
        System.out.println(returnScore("(()()()(()(())))"));
    }

    public static int returnScore(String s){
        Stack<Integer> stack = new Stack<>();
        for(int i =0; i< s.length(); i++){
            if(s.charAt(i) == '(')
                stack.push(0);
            else if(s.charAt(i) == ')'){
                if(stack.peek() == 0){
                    stack.pop();
                    stack.push(1);
                }else{
                    int val = 0;
                    while(stack.peek() != 0){
                         val += stack.pop();
                    }
                    val = val*2;
                    stack.pop();
                    stack.push(val);
                }
            }
        }
        int result = 0;
        if(stack.size() == 1)
            return stack.peek();
        else{

            while(!stack.isEmpty())
                result += stack.pop();
        }
        return result;
    }
}
