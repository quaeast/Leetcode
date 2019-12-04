import java.util.Arrays;
import java.util.HashMap;


//hashSet
class Solution169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i:nums){
            if(map.containsKey(i)){
                int val = map.get(i)+1;
                if(val>nums.length/2){
                    return i;
                }
                map.put(i, val);
            }else {
                map.put(i, 1);
            }
        }
        return nums[0];
    }
}

//sort
class Solution169_2 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
//        Arrays.sort(nums);
//        int halfLen = nums.length/2;
//        int len = 1;
//        for (int i=1;i<nums.length;i++){
//            if(len>halfLen){
//                return nums[i];
//            }
//            if(nums[i]==nums[i+1]){
//                len++;
//            }else {
//                len=1;
//            }
//        }
//        return nums[0];
    }
}


public class LC169 {
}
