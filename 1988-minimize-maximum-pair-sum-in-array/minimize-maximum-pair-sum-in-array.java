class Solution {
    public int minPairSum(int[] nums) {
        int max =0;
        Arrays.sort(nums);
        int right = nums.length-1;
        int left = 0;
        while(right > left)
        {
           int sum = nums[right] + nums[left];
           if(max < sum)
           {
            max = sum;
           }
           right--;
           left++;
        }
        return max;
    }
}