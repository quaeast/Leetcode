/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution104 {
    private int max = 0;
    private void maxDepth0(TreeNode root, int res){
        if(root==null){
            max = Math.max(max, res-1);
            return;
        }
        maxDepth0(root.left, res+1);
        maxDepth0(root.right, res+1);
    }

    public int maxDepth(TreeNode root) {
        max = 0;
        maxDepth0(root, 0);
        return max;
    }
}

public class LC104 {
    public static void main(String[] args){
        int a = 0;
        System.out.println(a);
    }
}
