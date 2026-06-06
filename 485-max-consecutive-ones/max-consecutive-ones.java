class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int strike =0;
        int max =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                strike++;
                if(max < strike) max = strike;
            }
            else 
                strike=0;
        }
        return max;
    }
}