/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution111 {
    private int min;

    private void minDepth0(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            min = Math.min(min, level + 1);
            return;
        }
        minDepth0(root.left, level + 1);
        minDepth0(root.right, level + 1);
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        min = Integer.MAX_VALUE;
        minDepth0(root, 0);
        return min;
    }
}

public class LC111 {
}
