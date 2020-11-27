class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int length_x = obstacleGrid.length;
        int length_y = obstacleGrid[0].length;
        if (obstacleGrid[0][0]==1||obstacleGrid[length_x-1][length_y-1]==1){
            return 0;
        }
        for (int i = 0; i < length_x; i++) {
            for (int j = 0; j < length_y; j++) {
                obstacleGrid[i][j] = obstacleGrid[i][j] == 0 ? 0 : -1;
            }
        }
        int adder = 1;
        for (int i = 0; i < length_x; i++) {
            if (obstacleGrid[i][0] == -1){
                adder = -1;
            }
            obstacleGrid[i][0] = adder;
        }
        adder = 1;
        for (int i = 0; i < length_y; i++) {
            if (obstacleGrid[0][i] == -1){
                adder = -1;
            }
            obstacleGrid[0][i] = adder;
        }
        for (int i = 1; i < length_x; i++) {
            for (int j = 1; j < length_y; j++) {
                if (obstacleGrid[i][j] == -1) {
                    continue;
                }
                obstacleGrid[i][j] += obstacleGrid[i - 1][j] == -1 ? 0 : obstacleGrid[i - 1][j];
                obstacleGrid[i][j] += obstacleGrid[i][j - 1] == -1 ? 0 : obstacleGrid[i][j - 1];
            }
        }
        return obstacleGrid[length_x - 1][length_y - 1];
    }
}

public class LC63 {

}
