/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//level begin from 1
class Solution104 {
    private void maxDepth0(TreeNode root, int level, int[] res){
        if(root==null){
            res[0] = Math.max(res[0], level);
            return;
        }
        maxDepth0(root.left, level+1, res);
        maxDepth0(root.right, level+1, res);
    }

    public int maxDepth(TreeNode root) {
        int[] res = {0};
        maxDepth0(root, 0, res);
        return res[0];
    }
}

public class LC104 {
    public static void main(String[] args){
        int a = 0;
        System.out.println(a);
    }
}
