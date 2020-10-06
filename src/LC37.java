class Solution37 {
    private static int[][] row;
    private static int[][] column;
    private static int[][][] grid;

    public void solveSudoku(char[][] board) {
        row = new int[9][10];
        column = new int[9][10];
        grid = new int[3][3][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    row[i][board[i][j] - '0'] = 1;
                    column[j][board[i][j] - '0'] = 1;
                    grid[i / 3][j / 3][board[i][j] - '0'] = 1;
                }
            }
        }
        solveSudoku0(board, 0, 0);
    }

    private static boolean isValid(char[][] board, int rowIndex, int columnIndex) {
        int number = board[rowIndex][columnIndex] - '0';
        return row[rowIndex][number] <= 1 && column[columnIndex][number] <= 1 && grid[rowIndex / 3][columnIndex / 3][number] <= 1;
    }

    // i j begin with 0, k begin with 1
    private boolean solveSudoku0(char[][] board, int rowIndex, int columnIndex) {
        if (rowIndex >= 8 && columnIndex >= 8 && board[8][8] != '.') {
            return isValid(board, 8, 8);
        }
        if (board[rowIndex][columnIndex] == '.') {
            for (int i = 1; i <= 9; i++) {
                board[rowIndex][columnIndex] = (char) ('0' + i);
                row[rowIndex][i]++;
                column[columnIndex][i]++;
                grid[rowIndex / 3][columnIndex / 3][i]++;
                if (solveSudoku0(board, rowIndex, columnIndex)) {
                    return true;
                }
                board[rowIndex][columnIndex] = '.';
                row[rowIndex][i]--;
                column[columnIndex][i]--;
                grid[rowIndex / 3][columnIndex / 3][i]--;
            }
        } else {
            if (isValid(board, rowIndex, columnIndex)) {
                if (columnIndex == 8) {
                    columnIndex = 0;
                    rowIndex++;
                } else {
                    columnIndex++;
                }
                return solveSudoku0(board, rowIndex, columnIndex);
            } else {
                return false;
            }
        }
        return false;
    }
}

public class LC37 {
    public static void main(String[] args) {
//        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        char[][] board = {{'.', '.', '9', '7', '4', '8', '.', '.', '.'}, {'7', '.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '2', '.', '1', '.', '9', '.', '.', '.'}, {'.', '.', '7', '.', '.', '.', '2', '4', '.'}, {'.', '6', '4', '.', '1', '.', '5', '9', '.'}, {'.', '9', '8', '.', '.', '.', '3', '.', '.'}, {'.', '.', '.', '8', '.', '3', '.', '2', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.', '6'}, {'.', '.', '.', '2', '7', '5', '9', '.', '.'}};
        Solution37 solution37 = new Solution37();
        solution37.solveSudoku(board);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
