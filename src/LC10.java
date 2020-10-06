class Solution10 {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) {
            return s.isEmpty();
        } else {
            if (p.length() > 1 && p.charAt(1) == '*') {
                if (s.isEmpty() || (p.charAt(0) != '.' && p.charAt(0) != s.charAt(0))) {
                    return isMatch(s, p.substring(2));
                } else {
                    return isMatch(s.substring(1), p);
                }
            } else if (s.isEmpty()) {
                return false;
            } else if (p.charAt(0) == '.' || p.charAt(0) == s.charAt(0)) {
                return isMatch(s.substring(1), p.substring(1));
            } else {
                return false;
            }
        }
    }
}


public class LC10 {
    public static void main(String[] args) {
    }
}
