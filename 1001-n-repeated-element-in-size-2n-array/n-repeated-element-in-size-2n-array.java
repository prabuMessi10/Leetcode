class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int result = -1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                result = i;
            }
        }
            return nums[result];
        
    }
}