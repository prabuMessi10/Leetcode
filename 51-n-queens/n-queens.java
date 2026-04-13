class Solution {
    public void backtrack(int n , List<List<String>> res,char[][] board,int row){
        if(row == n){
            ArrayList<String> subres = new ArrayList<>();
            for(int i=0;i<n;i++){
                subres.add(new String(board[i]));
            }
                res.add(subres);
            return;
        }
        for(int col =0;col<n;col++){
            if(isSafe(board,row,col)){
                board[row][col] = 'Q';
                backtrack(n,res,board,row+1);
                board[row][col] = '.';
            }
        }
    }   
    private boolean isSafe(char[][] board , int row , int col){
        int dummyc = col;
        int dummyr = row;

        while(row >=0){
            if(board[row][col] == 'Q') return false;
            row--;
        }
        row = dummyr;
        while(row >=0 && col>=0){
            if(board[row][col] == 'Q') return false;
            col--;
            row--;
        }
        col = dummyc;
        row = dummyr;
        while( row >= 0 && col < board.length){
            if(board[row][col] == 'Q') return false;
            row--;
            col++;
        }
        return true;

    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++)
        Arrays.fill(board[i],'.');
        backtrack(n,res,board,0);
        return res;
    }
}