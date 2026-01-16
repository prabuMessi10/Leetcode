class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int s_max = Integer.MIN_VALUE;
        int i=0;
        int j;
        for(int k=1;k<nums.length;k++){
            if(max < nums[k]){
                s_max = max;
                max = nums[k];
                j = i;
                i = k;
            }
            else if(s_max < nums[k]){
                s_max = nums[k];
                j = k;
            }
        }
        // System.out.print(max + "   " + s_max);
        if(max >= (s_max*2))
            return i;
        return -1; 
    }
}