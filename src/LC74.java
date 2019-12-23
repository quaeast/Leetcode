class Solution74 {
    private int[] get2DIndex(int i, int columns){
        int[] res = new int[2];
        res[0]=i/columns;
        res[1]=i%columns;
        return res;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix==null){
            return false;
        }else if(matrix[0]==null){
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int len = rows*columns;
        int high = len-1;
        int low = 0;
        while (low<=high){
            int []index = get2DIndex((low+high)/2, columns);
            if(target==matrix[index[0]][index[1]]){
                return true;
            }else if(target<=matrix[index[0]][index[1]]){
                high = (low+high)/2-1;
            }else {
                low = (low+high)/2+1;
            }
        }
        return false;
    }
}

// 1 2 3 4 5

public class LC74 {
    public static void main(String[] args){
        int [][] res;

    }
}
