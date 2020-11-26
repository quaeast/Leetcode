import java.util.regex.Pattern;

class Solution44 {
    public boolean isMatch(String s, String p) {
        StringBuffer stringBuffer = new StringBuffer(p);
        for (int i = 0; i < stringBuffer.length() - 1; i++) {
            if (stringBuffer.charAt(i) == stringBuffer.charAt(i + 1)) {
                stringBuffer.deleteCharAt(i);
                i--;
            }
        }
        return isMatch0(s, stringBuffer.toString(), 0, 0);
    }

    public boolean isMatch0(String s, String p, int sIndex, int pIndex) {
        if (sIndex >= s.length() || pIndex >= p.length()) {
            if (sIndex >= s.length() && pIndex >= p.length()) {
                return true;
            } else if (pIndex >= p.length()) {
                return false;
            } else {
                if (p.charAt(pIndex)=='*'){
                    return true;
                }else {
                    return false;
                }
            }
        }
        if (p.charAt(pIndex) == '*') {
            for (int i = sIndex; i <= s.length(); i++) {
                if (isMatch0(s, p, i, pIndex + 1)) {
                    return true;
                }
            }
        } else if (s.charAt(sIndex) == p.charAt(pIndex) || p.charAt(pIndex) == '?') {
            return isMatch0(s, p, sIndex + 1, pIndex + 1);
        } else {
            return false;
        }
        return false;
    }
}


public class LC44 {
    public static void main(String[] args) {
        Solution44 solution44 = new Solution44();
        System.out.println(solution44.isMatch("abbabaaabbabbaababbabbbbbabbbabbbabaaaaababababbbabababaabbababaabbbbbbaaaabababbbaabbbbaabbbbababababbaabbaababaabbbababababbbbaaabbbbbabaaaabbababbbbaababaabbababbbbbababbbabaaaaaaaabbbbbaabaaababaaaabb", "**aa*****ba*a*bb**aa*ab****a*aaaaaa***a*aaaa**bbabb*b*b**aaaaaaaaa*a********ba*bbb***a*ba*bb*bb**a*b*bb"));
        System.out.println(solution44.isMatch("", "*"));
    }
}
//"aaaabaaaabbbbaabbbaabbaababbabbaaaababaaabbbbbbaabbbabababbaaabaabaaaaaabbaabbbbaababbababaabbbaababbbba"
//"*****b*aba***babaa*bbaba***a*aaba*b*aa**a*b**ba***a*a*"


/*"abbabaaabbabbaababbabbbbbabbbabbbaba
aaaababababbbabababaabbababaabbbbbbaaaa
bababbbaabbbbaabbbbababababbaabbaababaa
bbbababababbbbaaabbbbbabaaaabbababbbbaa
babaabbababbbbbababbbabaaaaaaaabbbbbaabaaababaaaabb"
 */
/*"**aa*****ba*a*bb**aa*ab****a*aaaaaa
 * ***a*aaaa**bbabb*b*b**aaaaaaaaa*a****
 * ****ba*bbb***a*ba*bb*bb**a*b*bb"
 */

/*
"zacabz"
"*a?b*"
""
"*"
"mississippi"
"m??*ss*?i*pi"
"zacabz"
"*a?b*"
"abbabaaabbabbaababbabbbbbabbbabbbabaaaaababababbbabababaabbababaabbbbbbaaaabababbbaabbbbaabbbbababababbaabbaababaabbbababababbbbaaabbbbbabaaaabbababbbbaababaabbababbbbbababbbabaaaaaaaabbbbbaabaaababaaaabb"
"**aa*****ba*a*bb**aa*ab****a*aaaaaa***a*aaaa**bbabb*b*b**aaaaaaaaa*a********ba*bbb***a*ba*bb*bb**a*b*bb"
 */