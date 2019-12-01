class Solution59 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int top = 0;
        int button = n - 1;
        int left = 0;
        int right = n - 1;
        int i=0;
        while (i<n*n){
            for (int j = left; j <= right; j++) {
                res[top][j] = ++i;
            }
            top++;

            for (int j = top; j <= button; j++) {
                res[j][right] = ++i;
            }
            right--;

            for (int j = right; j >= left; j--) {
                res[button][j] = ++i;
            }
            button--;

            for (int j = button; j >= top; j--) {
                res[j][left] = ++i;
            }
            left++;
        }
        return res;
    }
}

public class LC59 {
    public static void main(String[] args){
        Solution59 solution59 = new Solution59();
        int res[][] = solution59.generateMatrix(5);
        for (int[] i:res){
            for (int j:i){
                System.out.printf("%3d", j);
            }
            System.out.println();
        }
    }
}
