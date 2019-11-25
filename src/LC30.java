import java.util.*;


/*
"barfoothefoobarman"
["foo","bar"]
"wordgoodgoodgoodbestword"
["word","good","best","word"]
"wordgoodgoodgoodbestword"
["word","good","best","good"]
""
[]
"wordgoodgoodgoodbestword"
["word","good","best","good"]
 */

class Solution30 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if (words.length == 0||s.length()==0) {
            return res;
        }
        int wordLen = words[0].length();
        int sumLen = words.length*wordLen;
        ArrayList templateBuffer = new ArrayList(words.length);
        templateBuffer.addAll(Arrays.asList(words));
        for (int i = 0; i < s.length() + 1 - words.length * wordLen; i++) {
            ArrayList tempBuffer = new ArrayList<>(templateBuffer);
            boolean flag = true;
            for (int j=i; j<i+sumLen; j+=wordLen){
                String subString = s.substring(j, j+wordLen);
                if(tempBuffer.contains(subString)){
                    tempBuffer.remove(subString);
                }else {
                    flag=false;
                    break;
                }
            }
            if (flag){
                res.add(i);
            }
        }
        return res;
    }
}

public class LC30 {

}
