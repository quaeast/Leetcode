import java.util.ArrayList;
import java.util.List;

class Solution144 {
    private static List<Integer> result;

    public void preorderTraversal0(TreeNode root) {
        if (root==null){
            return;
        }
        result.add(root.val);
        preorderTraversal0(root.left);
        preorderTraversal0(root.right);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        result=new ArrayList<>();
        preorderTraversal0(root);
        return result;
    }
}


public class LC144 {
}
