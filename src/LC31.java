import java.lang.reflect.Array;
import java.util.Arrays;

class Solution31 {
    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    private static void reverse(int[] arr, int beg, int end) {
        for (int i = beg; i < (beg + end) / 2; i++) {
            swap(arr, i, end - i - 1 + beg);
        }
    }

    public void nextPermutation(int[] nums) {
        boolean flag = true;
        for (int i = nums.length - 2; i >= 0 && flag; i--) {
            if (nums[i] < nums[i + 1]) {
                for (int j = nums.length - 1; j >= i; j--) {
                    if (nums[j] > nums[i]) {
                        swap(nums, i, j);
                        reverse(nums, i + 1, nums.length);
                        flag = false;
                        break;
                    }
                }
            }
        }
        if (flag) {
            Arrays.sort(nums);
        }
    }
}

public class LC31 {
    public static void main(String[] args) {

    }
}
