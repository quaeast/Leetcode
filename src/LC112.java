/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution112 {
    private boolean hasPathSum0(TreeNode root, int sum, int sumCur){
        if (root.left==null&root.right==null){
            return sum==sumCur;
        }
        return hasPathSum0(root.left, sum, sumCur+root.val)
                | hasPathSum0(root.right, sum, sumCur+root.val);
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null){
            return false;
        }
        return hasPathSum0(root, sum, root.val);
    }
}

public class LC112 {
}
