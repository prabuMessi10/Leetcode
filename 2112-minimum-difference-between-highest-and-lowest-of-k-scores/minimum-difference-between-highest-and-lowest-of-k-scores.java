class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length < 2)
            return 0;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int i = 0;
        for(k=k-1;k<nums.length;k++,i++){
            int diff = nums[k] - nums[i];
            if(min > diff)
                min = diff;
        }
        return min;
    }
}