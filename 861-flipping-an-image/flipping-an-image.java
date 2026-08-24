class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image.length];

        for(int i=0;i<image.length;i++){
            for(int j =0;j<image.length;j++){
                ans[i][j] = (image[i][image.length-j-1] == 1)? 0 : 1;
            }
        }
        return ans;
    }
}
