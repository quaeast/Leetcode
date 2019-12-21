import java.util.ArrayList;
import java.util.List;

class Solution107 {
    private void levelOrderBottom0(TreeNode root, int level, List<List<Integer>> res) {
        if(root==null){
            return;
        }
        if(res.size()<level+1){
            List<Integer> temp = new ArrayList<>();
            res.add(0, temp);
        }
        List<Integer> temp = res.get(res.size()-level);
        temp.add(root.val);
        levelOrderBottom0(root.left, level+1, res);
        levelOrderBottom0(root.right, level+1, res);
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        levelOrderBottom0(root, 0, res);
        return res;
    }
}

public class LC107 {
}
