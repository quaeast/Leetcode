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
class Solution101 {
    private boolean isSame(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return root1 == null && root2 == null;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return isSame(root1.right, root2.left) && isSame(root1.left, root2.right);
    }


    public boolean isSymmetric(TreeNode root) {
        return isSame(root, root);
    }
}

public class LC101 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(0);
        System.out.println();
    }
}
