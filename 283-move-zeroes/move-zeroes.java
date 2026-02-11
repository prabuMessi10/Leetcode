class Solution {
    public void moveZeroes(int[] nums) {
        int zero =0;
        int index =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 0)
                continue;
            nums[index++] = nums[i];
        }
        for(;index < nums.length;index++){
            nums[index] =0;
        }
    }
}