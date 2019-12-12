import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution100 {
    private void PreFix(TreeNode root, List<Integer> res){
        if(root==null){
            res.add(null);
            return;
        }
        res.add(root.val);
        PreFix(root.left,res);
        PreFix(root.right, res);
    }

    private void MidFix(TreeNode root, List<Integer> res){
        if(root==null){
            res.add(null);
            return;
        }
        PreFix(root.left,res);
        res.add(root.val);
        PreFix(root.right, res);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> pPre = new ArrayList<>();
        List<Integer> pMid = new ArrayList<>();
        List<Integer> qPre = new ArrayList<>();
        List<Integer> qMid = new ArrayList<>();
        PreFix(p, pPre);
        MidFix(p, pMid);
        PreFix(q, qPre);
        MidFix(q, qMid);
        if(pPre.equals(qPre)&&pMid.equals(qMid)){
            return true;
        }
        return false;
    }
}

class Solution100_1 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p.val!=q.val){
            return false;
        }

        return true;
    }
}

public class LC100 {
    public static void main(String[] args){
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> res2 = new ArrayList<>();
        res.add(null);
        res.add(1);
        res2.add(1);
        res2.add(null);
        System.out.println(res.equals(res2));
    }
}
