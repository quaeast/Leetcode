import java.util.Arrays;

class Solution75 {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}

class Solution75_1 {
    public void sortColors(int[] nums) {
        int p0 = 0;
        int p1 = nums.length - 1;
        int cur = 0;
        while (cur <= p1) {
            if (nums[cur] == 0) {
                int t = nums[cur];
                nums[cur] = nums[p0];
                nums[p0] = t;
                p0++;
                cur++;
            } else if (nums[cur] == 2) {
                int t = nums[cur];
                nums[cur] = nums[p1];
                nums[p1] = t;
                p1--;
            }else {
                cur++;
            }
        }
    }
}

public class LC75 {
    public static void main(String[] args) {
        int[] a = {0,1,2};
        Solution75_1 solution75_1 = new Solution75_1();
        solution75_1.sortColors(a);
    }
}
