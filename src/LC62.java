class Solution62 {
    public int uniquePaths0(int m, int n, int currentX, int currentY, int routeSum) {
        if (currentX + 1 == m && currentY + 1 == n) {
            return ++routeSum;
        }
        if (currentX >= m || currentY >= n) {
            return routeSum;
        }
        routeSum = uniquePaths0(m, n, currentX + 1, currentY, routeSum);
        routeSum = uniquePaths0(m, n, currentX, currentY + 1, routeSum);
        return routeSum;
    }

    public int uniquePaths(int m, int n) {
        return uniquePaths0(m, n, 0, 0, 0);
    }
}

class Solution62_2 {
    public int uniquePaths(int m, int n) {
        int[][] panel = new int[m][n];
        for (int i = 0; i < m; i++) {
            panel[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            panel[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                panel[i][j] = panel[i-1][j]+panel[i][j-1];
            }
        }
        return panel[m-1][n-1];
    }
}

public class LC62 {
    public static void main(String[] args) {

    }
}
