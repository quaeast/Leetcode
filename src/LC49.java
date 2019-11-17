import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] sortedStrs = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            byte[] t = strs[i].getBytes();
            Arrays.sort(t);
            sortedStrs[i] = new String(t);
        }
        List<List<String>> res = new ArrayList<>();
        List<String> sortList = new ArrayList<>();
        for (int i=0;i<strs.length;i++){
            boolean flag = true;
            for (int j =0;j<res.size();j++){
                if(sortList.get(j).equals(sortedStrs[i])){
                    res.get(j).add(strs[i]);
                    flag = false;
                    break;
                }
            }
            if (flag){
                ArrayList<String> t = new ArrayList<>();
                t.add(strs[i]);
                sortList.add(sortedStrs[i]);
                res.add(t);
            }
        }
        return res;
    }
}

public class LC49 {
    public static void main(String[] args) {
        Solution49 s = new Solution49();
        String[] ss = {"fang", "wang", "faafd"};
        s.groupAnagrams(ss);
    }
}
