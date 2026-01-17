class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum_1 =0;
        int sum_2 =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 9)
                sum_2+=nums[i];
            else
                sum_1+=nums[i];
        }
        if(sum_1 == sum_2)
            return false;
        return true;
    }
}