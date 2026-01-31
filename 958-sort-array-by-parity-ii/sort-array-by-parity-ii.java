class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] odd = new int[nums.length/2];
        int[] even = new int[nums.length/2];
        int o=0,e=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
                even[e++] = nums[i];
            else
                odd[o++] = nums[i];
        }
        o=0;
        e=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
                nums[i] = even[e++];
            else
                nums[i] = odd[o++];
        }
        return nums;
    }
}