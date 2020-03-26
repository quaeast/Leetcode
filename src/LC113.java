import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution113{
    private static List<List<Integer>> result;
    private static List<Integer> temp;
    private static int currentSum;

    public void pathSum0(TreeNode root, int sum) {
        if (root==null){
            return;
        }
        if (root.left==null&&root.right==null){
            if (currentSum+root.val==sum){
                List<Integer> currentListTemp = new ArrayList<>(temp);
                currentListTemp.add(root.val);
                result.add(currentListTemp);

            }
            return;
        }
        currentSum+=root.val;
        temp.add(root.val);
        pathSum0(root.left, sum);
        pathSum0(root.right, sum);
        currentSum-=root.val;
        temp.remove(temp.size()-1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        currentSum=0;
        result = new ArrayList<>();
        temp = new ArrayList<>();
        pathSum0(root, sum);
        return result;
    }
}

public class LC113 {
    public static void main(String[] args) {
        List<List<Integer>> bigArray = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        a.add(1);
        bigArray.add(a);
        a.add(2);
        bigArray.add(a);
        for (int i=0;i<bigArray.size();i++){
            System.out.println(bigArray.get(i).size());
        }
    }
}
