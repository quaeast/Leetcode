class Solution110 {
    private int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getDepth(root.left), getDepth(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(getDepth(root.left) - getDepth(root.right)) > 1) {
            return false;
        }
        return isBalanced(root.right) && isBalanced(root.left);
    }
}

class Solution110_1 {
    private int isBalanced0(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left = isBalanced0(root.left);
        int right = isBalanced0(root.right);

        if (left==-1||right==-1||Math.abs(left-right)>1){
            return -1;
        }
        return 1+Math.max(left, right);
    }

    public boolean isBalanced(TreeNode root) {
        return isBalanced0(root)!=-1;
    }
}


public class LC110 {
}
