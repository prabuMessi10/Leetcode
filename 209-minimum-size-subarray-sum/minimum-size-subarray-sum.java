class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int start =0;
        int end =0;
        int sum =0;
        for(;start<nums.length;start++)
        {
            while(sum < target && end < nums.length){
                sum+=nums[end];
                end++;
            }
            if(sum >=target)
                min = Math.min(min,end-start+1);
            sum-=nums[start];
        }
        if(min == Integer.MAX_VALUE)
            min =1;
        return min-1;
    }
}