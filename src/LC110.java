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

/*
I always think trees are elegant data structures.
So Today I solved an easy problem that given a binary tree and
determines if it is height-balanced.
The so called height-balanced is plain without the attached condition
that it should be a binary search tree first. So it's not hard to solve.
First, It could find the depth of each part of three
one by one by write an individual function and use it in a
recursive process which is the main method to solve the problem.
Evidently, the time complexity is O(n^2), and this is too clumsy.
So it can't be simplified by comparing and
calculating depth simultaneously in a pass from leaves to the root.
And finally, it‘s O(N).
 */

public class LC110 {
}
