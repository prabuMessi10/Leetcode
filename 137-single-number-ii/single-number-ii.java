class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for( i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1] && nums[i+1] == nums[i+2]){
                i+=2;
            }
            else{
                
                return nums[i];
            }
        }
        return nums[i];
    }
}