class Solution48 {
    public void rotate(int[][] matrix) {
        if (matrix.length == 0) {
            return;
        }
        int[][] res = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                res[i][j] = matrix[matrix.length-j-1][i];
            }
        }
        for (int i=0; i<matrix.length;i++){
            for (int j =0;j<matrix.length;j++){
                matrix[i][j] = res[i][j];
            }
        }
    }
}

public class LC48 {

}
