import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


class Solution139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        return wordBreak(s, new HashSet<>(wordDict), 0);
    }
    public boolean wordBreak(String s, Set<String> wordDict, int beg) {
        if(beg==s.length()){
            return true;
        }
        for (int i = beg + 1; i <= s.length(); i++) {
            if (wordDict.contains(s.substring(beg, i)) && wordBreak(s, wordDict, i)) {
                return true;
            }
        }
        return false;
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
    }
}
