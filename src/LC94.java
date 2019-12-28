import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution94 {
    public void inorderTraversal0(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorderTraversal0(root.left, res);
        res.add(root.val);
        inorderTraversal0(root.right, res);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderTraversal0(root, res);
        return res;
    }
}

class Solution94_1 {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        TreeNode temp = root;
        while (!(temp==null&&stack.isEmpty())){
            while (temp!=null){
                stack.push(temp);
                temp = temp.left;
            }
            temp = stack.pop();
            res.add(temp.val);
            temp = temp.right;
        }
        return res;
    }
}

public class LC94 {
    public static void main(String[] args) {
    }
}
