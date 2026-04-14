class Solution {
    public boolean isValid(char[][] board , int row , int col){
        for(int i=0;i<9;i++){
           if (i != col && board[row][i] == board[row][col]) return false;
           if (i != row && board[i][col] == board[row][col]) return false;
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (i == row && j == col) continue;
                if (board[i][j] == board[row][col]) return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] == '.') continue;
                if(!isValid(board,i,j)) return false;
            }
        }
        return true;
    }
}