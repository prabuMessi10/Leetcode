class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] po = new int[nums.length/2];
        int[] ne = new int[nums.length/2];
        int p=0;
        int n =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0)
                po[p++] = nums[i];
            else
                ne[n++] = nums[i];
        }
        p =0;
        n =0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0)
                nums[i] = po[p++];
            else
                nums[i] = ne[n++];
        }
        return nums;
    }
}