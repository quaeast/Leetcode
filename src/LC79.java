class Solution79 {
    private boolean exist0(char[][] board, String word, int wordIndex, int x, int y, boolean[][] footPrint) {
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length) {
            return false;
        }
        if (board[x][y] != word.charAt(wordIndex) || footPrint[x][y]) {
            return false;
        }
        if (word.length() == wordIndex + 1) {
            return true;
        }
        footPrint[x][y] = true;
        boolean result = exist0(board, word, wordIndex + 1, x + 1, y, footPrint)
                || exist0(board, word, wordIndex + 1, x - 1, y, footPrint)
                || exist0(board, word, wordIndex + 1, x, y + 1, footPrint)
                || exist0(board, word, wordIndex + 1, x, y - 1, footPrint);
        if (!result) {
            footPrint[x][y] = false;
        }
        return result;
    }

    public boolean exist(char[][] board, String word) {
        boolean[][] footPrint = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                footPrint[i][j] = false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (exist0(board, word, 0, i, j, footPrint)) {
                    return true;
                }
            }
        }
        return false;
    }
}

public class LC79 {
    public static void main(String[] args) {

    }
}
