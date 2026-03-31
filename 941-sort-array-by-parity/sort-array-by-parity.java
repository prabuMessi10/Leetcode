class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        for(;i<nums.length;i++){
            if(nums[i]%2!=0) break;
        }
        if(i<nums.length){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]%2==0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
            }
        }
        return nums;
    }
}