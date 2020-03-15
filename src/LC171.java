class Solution171 {
    public int titleToNumber(String s) {
        int result =  0;
        for (int i = 0; i <= s.length()-1; i++) {
            result+=(s.charAt(s.length()-1-i)-'A'+1)*Math.pow(26, i);
        }
        return result;
    }
}

public class LC171 {

}