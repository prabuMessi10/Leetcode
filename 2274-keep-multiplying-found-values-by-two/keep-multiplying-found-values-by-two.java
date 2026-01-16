class Solution {
    public int findFinalValue(int[] nums, int original) {
        for(int i=0;i<nums.length;i++){
            if(find(nums,original)){
                original = 2*original;
            }
            else
                return original;
        }
        return original;
    }
    private boolean find(int[] nums, int orginal){
        for(int n : nums){
            if(n == orginal)
                return true;
        }
        return false;
    }
}