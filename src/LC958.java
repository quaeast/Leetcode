import java.util.ArrayList;
import java.util.List;

class Solution958 {
    private static List<Integer> depth_list;

    // the depth[parameter] begins from 0,
    // to find the depth of every path from root to the null,
    // (null is counted in)
    // and store them to the depth_list[static member]
    private static void getDepthList(TreeNode root, int depth) {
        if (root == null) {
            depth_list.add(depth);
            return;
        }
        getDepthList(root.left, depth + 1);
        getDepthList(root.right, depth + 1);
    }

    // make a judgement
    // if depth_list[static member] is like
    // n, ..., n, n-1, ..., n-1
    public boolean isCompleteTree(TreeNode root) {
        depth_list = new ArrayList<>();
        getDepthList(root, 0);
        if (depth_list.size() == 0) {
            return false;
        }
        int max_depth = depth_list.get(0);
        boolean is_minus = false;
        for (Integer i : depth_list) {
            System.out.print(i+" ");
            if (i != max_depth && i == max_depth - 1 && !is_minus) {
                max_depth--;
                is_minus = true;
            }
            if (i != max_depth) {
                return false;
            }
        }
        return true;
    }
}

public class LC958 {
}
