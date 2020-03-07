class Solution125 {
    public boolean isPalindrome(String s) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)){
                c = Character.toLowerCase(c);
                temp.append(c);
            }
        }
        String originalTemp = temp.toString();
        return originalTemp.equals(temp.reverse().toString());
    }
}

public class LC125 {
    public static void main(String[] args) {
        StringBuffer b = new StringBuffer("fang");
        System.out.println(b.reverse().toString());
        System.out.println(b);
    }
}
