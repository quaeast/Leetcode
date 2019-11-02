class Solution11 {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                max = Math.max(max, (j - i) * Math.min(height[i], height[j]));
            }
        }
        return max;
    }
}

class Solution11_1 {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j=height.length-1; i < j;) {
            max = Math.max(max, (j - i) * Math.min(height[i], height[j]));
            if(height[i]<height[j]){
                i++;
            }else {
                j--;
            }
        }
        return max;
    }
}

public class LC11 {
    public static void main(String[] args) {
        Solution11 s = new Solution11();
        int[] a = {10, 5};
        System.out.println(s.maxArea(a));
    }
}
