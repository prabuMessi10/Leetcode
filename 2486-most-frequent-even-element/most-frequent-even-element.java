class Solution {
    public int mostFrequentEven(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]) max = nums[i];
        }
        int[] feq = new int[max+1];
        int fmax=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
            feq[nums[i]]++;
            if(feq[nums[i]] > fmax) fmax = feq[nums[i]];
            }
        }
        for(int i=0;i<=max;i++){
            if(fmax == feq[i])
                 return i;
        }
        return -1;
    }
}