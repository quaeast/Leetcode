import java.util.*;
import java.util.List;

class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n == 0) {
            return res;
        }
        res.add("()");
        for (int i = 1; i < n; i++) {
            List<String> newRes = new ArrayList<>();
            for (Iterator it = res.iterator(); it.hasNext(); ) {
                String tString = (String) it.next();
                newRes.add("(" + tString + ")");
                newRes.add("()" + tString);
                newRes.add(tString + "()");
            }
            res = newRes;
        }
        Set<String> setRes = new HashSet<>(res);
        return new ArrayList<>(setRes);
    }
}


class Solution22_1 {
    private boolean isValid(String s) {
        Stack<Character> bufferStack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (bufferStack.isEmpty() || bufferStack.peek() == s.charAt(i)) {
                bufferStack.push(s.charAt(i));
            } else if (bufferStack.peek() == '(' && s.charAt(i) == ')') {
                bufferStack.pop();
            }
        }
        return bufferStack.isEmpty();
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        res.add("");
        for (int i = 0; i < n*2; i++) {
            List<String> newRes = new ArrayList<>();
            for (Iterator it = res.iterator(); it.hasNext(); ) {
                String template = (String) it.next();
                newRes.add(template + "(");
                newRes.add(template + ")");
            }
            res = newRes;
        }
        Set<String> setRes = new HashSet<>();
        for (Iterator it = res.iterator(); it.hasNext(); ) {
            String temp = (String) it.next();
            if (isValid(temp)) {
                setRes.add(temp);
            }
        }
        return new ArrayList<>(setRes);
    }
}


public class LC22 {
    public static void main(String[] args) {
        Solution22_1 s = new Solution22_1();
        s.generateParenthesis(2);
    }
}
