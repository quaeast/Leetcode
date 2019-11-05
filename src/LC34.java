import java.util.ArrayList;
import java.util.Arrays;

class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        for (int i=0,j=nums.length-1;i<nums.length;i++,j--){
            if(nums[i]==target){
                res[1]=i;
            }
            if(nums[j]==target){
                res[0]=j;
            }
        }
        return res;
    }
}

public class LC34 {
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1 ,1};
        System.out.println(Arrays.binarySearch(a, 1));
    }
}
