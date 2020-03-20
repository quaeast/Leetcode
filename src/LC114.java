import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Solution114 {
    private static TreeNode result;
    private static TreeNode endResult;


    public void flatten0(TreeNode root) {
        if (root == null) {
            return;
        }
        endResult.right = endResult;
        endResult.left = null;
        endResult = endResult.right;
        flatten0(root.left);
        flatten0(root.right);
    }

    public void flatten(TreeNode root) {
        result = new TreeNode(0);
        endResult = result;
        flatten0(root);
        if (root!=null){
            root.right = result.right.right;
        }
    }
}

public class LC114 {
}
