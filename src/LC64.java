class Solution64 {
    public int minPathSum(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        int[][] dpGrid = new int[x][y];
        dpGrid[0][0] = grid[0][0];
        for (int j = 1; j < y; j++) {
            dpGrid[0][j] = dpGrid[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < x; i++) {
            dpGrid[i][0] = dpGrid[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < x; i++) {
            for (int j = 1; j < y; j++) {
                dpGrid[i][j] = grid[i][j] + Math.min(dpGrid[i - 1][j], dpGrid[i][j - 1]);
            }
        }
        return dpGrid[x - 1][y - 1];
    }
}

public class LC64 {
    Solution64 solution64 = new Solution64();
}
