import java.util.ArrayList;
import java.util.List;

class Solution145 {
    private List<Integer> result;

    public void postorderTraversal0(TreeNode root) {
        if (root==null){
            return;
        }
        postorderTraversal0(root.left);
        postorderTraversal0(root.right);
        result.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        postorderTraversal0(root);
        return result;
    }
}

public class LC145 {

}
