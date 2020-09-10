

import java.lang.reflect.Array;
import java.util.*;

class Solution32 {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack();
        stack.add(-1);
        int max=0;
        for (int i=0;i<s.length();i++){
            char t = s.charAt(i);
            if(t=='('){
                stack.push(i);
            }else {
                stack.pop();
                if(!stack.isEmpty()){
                    max = Math.max(max, i-stack.peek());
                }else {
                    stack.push(i);
                }
            }
        }
        return max;
    }
}

public class LC32 {
}
