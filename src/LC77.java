import java.util.ArrayList;
import java.util.List;

class Solution77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k == 0) {
            res.add(new ArrayList<>());
            return res;
        }
        for (int i = 1; i <= n - k + 1; i++) {
            for (int j = i + 1; j <= n - k + 2; j++) {
                ArrayList<Integer> temp = new ArrayList<>(k);
                temp.add(i);
                if (k==1){
                    res.add(temp);
                    break;
                }
                for (int l = j; l <= j + k - 2; l++) {
                    temp.add(l);
                }
                res.add(temp);
            }
        }
        return res;
    }
}

public class LC77{
    public static void main(String[] args) {

    }
}