class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int k = nums.length-1;
        while(left <= right){
            int s1 = nums[left]*nums[left];
            int s2 = nums[right]*nums[right];
            if(s1 < s2){
                ans[k--] = s2;
                right--;
            }
            else{
                ans[k--] = s1;
                left++;
            }
        }
        return ans;
        }
}