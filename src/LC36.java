import java.util.HashSet;
import java.util.Set;

class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> line = new HashSet<>();
        Set<Character> row = new HashSet<>();
        Set<Character> subBox = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (line.contains(board[i][j])) {
                        return false;
                    }
                    line.add(board[i][j]);
                }
                if (board[j][i] != '.') {
                    if (row.contains(board[j][i])) {
                        return false;
                    }
                    row.add(board[j][i]);
                }
            }
            line.clear();
            row.clear();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int beg_i = 3*i;
                int beg_j = 3*j;
                for (int sub_i=beg_i;sub_i<beg_i+3;sub_i++){
                    for (int sub_j=beg_j;sub_j<beg_j+3;sub_j++){
                        if(board[sub_i][sub_j]!='.'){
                            if(subBox.contains(board[sub_i][sub_j])){
                                return false;
                            }
                            subBox.add(board[sub_i][sub_j]);
                        }
                    }
                }
                subBox.clear();
            }
        }
        return true;
    }
}

public class LC36 {
}
