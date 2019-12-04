import java.util.ArrayList;
import java.util.List;

class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows <= 0) {
            return res;
        }
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        res.add(temp);
        for (int i = 1; i < numRows; i++) {
            List<Integer> cur = new ArrayList<>(i + 1);
            cur.add(0, 1);
            for (int j = 0; j < i - 1; j++) {
                cur.add(j+1, temp.get(j)+temp.get(j+1));
            }
            cur.add(1);
            res.add(cur);
            temp=cur;
        }
        return res;
    }
}
public class LC118 {
    public static void main(String[] args){
        Solution118 solution118 = new Solution118();
        solution118.generate(3);

    }
}
