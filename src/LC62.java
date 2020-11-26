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

public class LC62 {
    public static void main(String[] args) {

    }
}
