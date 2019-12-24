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
class Solution235 {
    private List<TreeNode> getAncestorList(TreeNode root, TreeNode target) {
        List<TreeNode> res = new ArrayList<>();
        TreeNode cur = root;
        while (true) {
            if (cur == null) {
                return new ArrayList<>();
            }
            res.add(cur);
            if (target==cur) {
                break;
            } else if (target.val < cur.val) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return res;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> ListP = getAncestorList(root, p);
        List<TreeNode> ListQ = getAncestorList(root, q);
        int k = 0;
        TreeNode res = null;
        for (int i=0;i<Math.min(ListP.size(), ListQ.size());i++){
            if(ListP.get(i)==ListQ.get(i)){
                res = ListP.get(i);
            }
        }
        return res;
    }
}

public class LC235 {
}
