

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution103 {
    private void zigzagLevelOrder0(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() < level + 1) {
            List<Integer> tempList = new ArrayList<>();
            tempList.add(root.val);
            res.add(tempList);
        } else {
            List<Integer> tempList = res.get(level);
            if (level % 2 == 0) {
                tempList.add(root.val);
            } else {
                tempList.add(0, root.val);
            }
        }
        zigzagLevelOrder0(root.left, level + 1, res);
        zigzagLevelOrder0(root.right, level + 1, res);
    }



    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        zigzagLevelOrder0(root, 0, res);
        return res;
    }
}

public class LC103 {
    public static void main(String[] args) {
        List<Integer> i = new ArrayList<>();
        i.add(1);
        i.add(0, 2);
        for (int j : i) {
            System.out.println(j);
        }
    }
}
