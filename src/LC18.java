import java.util.*;

class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length-2; j++) {
                for (int k = j + 1; k < nums.length-1; k++) {
                    for (int l = k + 1; l < nums.length; l++) {
                        if(nums[i]+nums[j]+nums[k]+nums[l]==target){
                            List<Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);
                            res.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}

public class LC18 {
}
