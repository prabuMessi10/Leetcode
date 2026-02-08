class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max_sum = 0;
        for(int i=0;i<k;i++)
        {
            max_sum +=nums[i];
        }
        int sum = max_sum;
        for(int i = 0;i<nums.length-k;i++)
        {
            sum = sum - nums[i] + nums[i+k];
            max_sum = Math.max(sum,max_sum);
        }
        return (double)max_sum/k;
    }
}