class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return null;
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int pre_begin, int in_begin, int in_end) {
        if (pre_begin == preorder.length - 1) {
            return null;
        }
        TreeNode head = new TreeNode(preorder[pre_begin]);
        int in_position = in_begin;
        for (; in_begin <= in_end; in_begin++) {
            if (preorder[pre_begin] == inorder[in_begin]) {
                break;
            }
        }
        head.left = buildTree(preorder, inorder, pre_begin + 1, ++pre_begin, in_position - 1);
        head.right = buildTree(preorder, inorder, pre_begin + 1, in_position + 1, in_end);
        return head;
    }
}
