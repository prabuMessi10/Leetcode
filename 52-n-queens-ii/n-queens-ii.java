class Solution {
    int count=0;
    public void backtrack(int n , char[][] board , int row){
        if(row==n){ count++;
        return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(board,row,col)){
                board[row][col] = 'Q';
                backtrack(n,board,row+1);
                board[row][col] ='.' ;
            }
        }
    }
    private boolean isSafe(char[][] board , int row, int col){
        int dummyc = col;
        int dummyr = row;
        while(row >= 0){
            if(board[row][col] == 'Q') return false;
            row--;
        }
        row  = dummyr;
        while(row>=0 && col>=0){
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        row = dummyr;
        col = dummyc;
        while(row >= 0 && col < board.length){
            if(board[row][col] == 'Q') return false;
            row--;
            col++;
        }
        return true;
    }
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
       
        backtrack(n,board,0);
        return count;
    }
}