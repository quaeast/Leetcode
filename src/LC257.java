import java.util.ArrayList;
import java.util.List;

class Solution257 {
    private static List<String> result;

    public void binaryTreePaths0(TreeNode root, String temp) {
        if (root==null){
            return;
        }
        if (temp==null){
            temp = ""+root.val;
        }else {
            temp = temp+root.val+"->";
        }
        if (root.left==null&&root.right==null){
            result.add(temp);
        }
        binaryTreePaths0(root.left, temp);
        binaryTreePaths0(root.right, temp);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        result = new ArrayList<>();
        binaryTreePaths0(root, null);
        return result;
    }
}

public class LC257 {

}
