class Solution {
    public void solveSudoku(char[][] board) {
        solver(board);
    }

    boolean solver(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char k = '1'; k <= '9'; k++) {

                        if (isvalid(board, i, j, k)) {
                            board[i][j] = k;
                            if (solver(board)){
                                return true;
                            }

                            board[i][j] = '.';

                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    boolean isvalid(char[][] board, int i, int j, char num) {
        for (int c = 0; c < 9; c++) {
            if (board[i][c] == num || board[c][j] == num)
                return false;

            
        }
        int startRow = (i / 3) * 3;
            int startCol = (j / 3) * 3;
            for (int k = startRow; k < startRow + 3; k++) {
                for (int l = startCol; l < startCol + 3; l++) {
                    if (board[k][l] == num)
                        return false;
                }
            }
        return true;
    }
}