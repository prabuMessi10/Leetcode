class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int left = 0;
        int right = n-1;
        while(left < right){
            ans[left] = -(n);
            ans[right] = n;
            left++;
            right--;
            n++;
        }
        return ans;
    }
}