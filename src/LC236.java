import java.util.ArrayList;
import java.util.Iterator;
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
class Solution236 {
    private boolean getAncestors(TreeNode root, TreeNode target, List<TreeNode> res) {
        res.add(root);
        if (root == target) {
            return true;
        }
        if (root == null) {
            res.remove(res.size() - 1);
            return false;
        }
        boolean isOk = getAncestors(root.left, target, res) || getAncestors(root.right, target, res);
        if (isOk) {
            return true;
        } else {
            res.remove(res.size() - 1);
            return false;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathP = new ArrayList<>();
        List<TreeNode> pathQ = new ArrayList<>();
        getAncestors(root, p, pathP);
        getAncestors(root, q, pathQ);
        TreeNode res = null;
        System.out.print(pathP.size());
        System.out.print(" ");
        System.out.println(pathQ.size());
        for (int i = 0; i < Math.min(pathP.size(), pathQ.size()); i++) {
            if (pathP.get(i) == pathQ.get(i)) {
                res = pathP.get(i);
            }
        }
        return res;
    }
}

public class LC236 {
}
