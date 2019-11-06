import java.lang.reflect.Array;
import java.util.Arrays;

class Solution189 {
    public void rotate(int[] nums, int k) {
        int[] temp = nums.clone();
        for (int i = 0; i < nums.length; i++) {
            nums[(i + k) % nums.length] = temp[i];
        }
    }
}

public class LC189 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.println(a);
    }
}
