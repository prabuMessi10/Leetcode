class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max =0;
        int strike=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 1){
                strike++;
            }
            else{
                strike=0;
            }
            if(max < strike) 
                max = strike;
        }
        return max;
    }
}