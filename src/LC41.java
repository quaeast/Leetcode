import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution41 {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numsSet.add(nums[i]);
        }
        for (int i = 1; ; i++) {
            if(!numsSet.contains(i)){
                return i;
            }
        }
    }
}

public class LC41 {
    public static void main(String[] args){
        HashMap<Integer, Integer> nums = new HashMap<>();
        nums.put(1, 2);
        System.out.println(nums.get(2));
    }

}
