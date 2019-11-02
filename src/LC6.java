class Solution6 {
    public String convert(String s, int numRows) {
        // why we need this if? pay to line 14, 15，18。the j's add are always 0,
        // so it will append the first char of s into the res
        // so it will get a Memory Limit Exceeded
        if(numRows==1){
            return s;
        }
        StringBuffer res = new StringBuffer(s.length());
        for (int i = 0; i < numRows; i++) {
            boolean oddFlag = true;
            int addOdd = (numRows - i - 1) * 2;
            int addEven = i * 2;
            for (int j = i; j < s.length(); ) {
                res.append(s.charAt(j));
                if (addOdd == 0 || addEven == 0) {
                    j += Math.max(addOdd, addEven);
                    continue;
                }
                if (oddFlag) {
                    j += addOdd;
                } else {
                    j += addEven;
                }
                oddFlag = !oddFlag;
            }
        }
        return res.toString();
    }
}

public class LC6 {
    public static void main(String[] args) {
        Solution6 s = new Solution6();
        System.out.println(s.convert("aggfdafas", 1));
    }
}
