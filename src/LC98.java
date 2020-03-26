import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution98_wrong {
    public boolean isValidBST(TreeNode root) {
        if (root==null){
            return true;
        }
        boolean leftNotValid = root.left!=null&&root.left.val>=root.val;
        boolean rightNotValid = root.right!=null&&root.right.val<=root.val;
        boolean leftAndRightNotValid = root.left!=null&&root.right!=null&&root.left.val>=root.right.val;
        if (leftAndRightNotValid||rightNotValid||leftNotValid){
            System.out.println(false);
            return false;
        }
        return isValidBST(root.left)&&isValidBST(root.right);
    }
}

class Solution98 {
    private static List<Integer> midOrderList;

    private static void midOrder(TreeNode root){
        if (root==null){
            return;
        }
        midOrder(root.left);
        midOrderList.add(root.val);
        midOrder(root.right);
    }

    public boolean isValidBST(TreeNode root) {
        midOrderList = new ArrayList<>();
        midOrder(root);
        for (int i=0; i<midOrderList.size()-1;i++){
            if (midOrderList.get(i)>=midOrderList.get(i+1)){
                return false;
            }
        }
        return true;
    }
}



public class LC98 {}
