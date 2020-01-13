/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

// 1, 2, 3, 4
class Solution108 {
    private void sortedArrayToBTS0(int[] nums, int begin, int end, TreeNode node) {
        int mid = (begin + end) / 2;
        if (begin <= mid - 1) {
            node.left = new TreeNode(nums[(begin + mid - 1) / 2]);
            sortedArrayToBTS0(nums, begin, mid - 1, node.left);
        }
        if (mid + 1 <= end) {
            node.right = new TreeNode(nums[(mid + 1 + end) / 2]);
            sortedArrayToBTS0(nums, mid + 1, end, node.right);
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null | nums.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(nums[(nums.length - 1) / 2]);
        sortedArrayToBTS0(nums, 0, nums.length - 1, root);
        return root;
    }
}

public class LC108 {
}
