import java.util.ArrayList;

class Solution73 {
    public void setZeroes(int[][] matrix) {
        if (matrix==null){
            return;
        }
        ArrayList<int[]> zeros = new ArrayList<>();
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    zeros.add(new int[]{i, j});
                }
            }
        }
        for (int[] z:zeros){
            for (int i=0;i<matrix.length;i++){
                matrix[i][z[1]]=0;
            }
            for (int i=0;i<matrix[0].length;i++){
                matrix[z[0]][i]=0;
            }
        }
    }
}

public class LC73 {
}
