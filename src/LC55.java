/*
[2,3,1,1,4]
[3,2,1,0,4]
[1]
[2, 0]
[2,5,0,0]
[1, 2]
 */

class Solution55 {
    private boolean canJump0(int[] nums, int begin, boolean[] dp) {
        if (begin >= nums.length - 1) {
            return true;
        } else if (nums[begin] == 0) {
            return false;
        }
        for (int i = nums[begin]; i > 0; i--) {
            if (canJump0(nums, begin + i, dp)) {
                return true;
            }
        }
        return false;
    }

    public boolean canJump(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        boolean[] dp = new boolean[nums.length];//f
        return canJump0(nums, 0, dp);
    }
}

//On
class Solution55_n {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return false;
            }
            max = Math.max(max, nums[i] + i);
            if (max >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}

class Solution55_n2 {
    public boolean canJump(int[] nums) {
        int max=0;
        int i=0;
        while(max<nums.length-1){
            max=Math.max(max, i+nums[i]);
            if(i==max) return false;
            i++;
        }
        return true;
    }
}

public class LC55 {
    public static void main(String[] args) {

    }
}
