import java.util.ArrayList;
import java.util.List;

class Solution78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        if (nums.length == 0) {
            return result;
        }
        int[] newNums = new int[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            newNums[i - 1] = nums[i];
        }
        result = subsets(newNums);
        int resultLength = result.size();
        for (int i = 0; i < resultLength; i++) {
            List<Integer> buffer = new ArrayList<>(result.get(i));
            buffer.add(0, nums[0]);
            result.add(buffer);
        }
        return result;
    }
}

public class LC78 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        Solution78 solution78 = new Solution78();
        List<List<Integer>> list = solution78.subsets(nums);
        System.out.println(list);
    }
}
