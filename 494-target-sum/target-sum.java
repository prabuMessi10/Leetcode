class Solution {
    public int solution(int i ,int[] nums , int target , int sum){
        if(i==nums.length){
            if(sum == target){
                return 1;
            }
            return 0;
        }
        int l = solution(i+1,nums,target,sum+nums[i]);
        int r = solution(i+1,nums,target,sum-nums[i]);
        return l+r;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return solution(0,nums,target,0);
    }
}