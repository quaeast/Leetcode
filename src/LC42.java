
//Brute force
class Solution42 {
    public int trap(int[] height) {
        int sum = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int maxLeft = 0;
            int maxRight = 0;
            for (int j = i; j >= 0; j--) {
                maxLeft = Math.max(maxLeft, height[j]);
            }
            for (int j = i; j < height.length; j++) {
                maxRight = Math.max(maxRight, height[j]);
            }
            sum += Math.min(maxLeft, maxRight) - height[i];
        }
        return sum;
    }
}


public class LC42 {
    public static void main(String[] args) {
        Solution42 s = new Solution42();
        int[] ans = {4, 2, 4};
        int[] ans2 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int a = s.trap(ans2);
        System.out.println(a);
    }
}
