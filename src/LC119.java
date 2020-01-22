import java.util.ArrayList;
import java.util.List;

class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        if (rowIndex <= 0) {
            return null;
        }
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        res.add(temp);
        for (int i = 1; i < rowIndex; i++) {
            List<Integer> cur = new ArrayList<>(i + 1);
            cur.add(0, 1);
            for (int j = 0; j < i - 1; j++) {
                cur.add(j+1, temp.get(j)+temp.get(j+1));
            }
            cur.add(1);
            res.add(cur);
            temp=cur;
        }
        return res.get(res.size()-1);
    }
}

public class LC119 {
    public static void main(String[] args) {

    }
}
