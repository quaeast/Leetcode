import java.util.Arrays;
import java.util.List;

class Solution139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        return true;
    }
}

/*
"leetcode"
["leet","code"]
"applepenapple"
["apple", "pen"]
"catsandog"
["cats", "dog", "sand", "and", "cat"]
"cars"
["car","ca","rs"]
 */

public class LC139 {
    public static void main(String[] args) {
        Solution139 solution139 = new Solution139();
        String s = "applepenapple";
        String[] bu = {"apple", "pen"};
        solution139.wordBreak(s, Arrays.asList(bu));
        System.out.println(s.indexOf("apple", 5));
    }
}
