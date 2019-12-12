import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private void levelOrder0(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() < level + 1) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        levelOrder0(root.left, level + 1, res);
        levelOrder0(root.right, level + 1, res);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        levelOrder0(root, 0, res);
        return res;
    }
}

public class LC102 {
}
