class NumMatrix {
    int[][] pre;
    public NumMatrix(int[][] matrix) {
        pre = matrix;
        for(int i=0;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                pre[i][j] = pre[i][j]+pre[i][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum =0;
        if(col1==0){
            for(int i=row1;i<=row2;i++){
                sum+=pre[i][col2];
            }
        }
        else{
            for(int i=row1;i<=row2;i++){
                sum = sum + (pre[i][col2] - pre[i][col1-1]);
            }
        }
        return sum;
    }
}



/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */