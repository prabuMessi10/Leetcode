class Solution {
    public int maxSubArray(int[] nums) {
        // if(nums.length == 1)
        //     return nums[0];
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(max < sum)
        //             max = sum;
        //     }
        // }
        // return max;
        int max = nums[0];
        int current = nums[0];
        for(int i=1;i<nums.length;i++){
            current = Math.max(nums[i] , current+nums[i]);
            max = Math.max(max,current);
        }
        return max;
    }
}