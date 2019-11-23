import java.util.HashMap;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(temp.containsKey(target-nums[i])){
                int[] res = new int[2];
                res[0] = temp.get(target-nums[i]);
                res[1] = i;
                return res;
            }else {
                temp.put(nums[i], i);
            }
        }
        return null;
    }
}

public class LC1 {
}
