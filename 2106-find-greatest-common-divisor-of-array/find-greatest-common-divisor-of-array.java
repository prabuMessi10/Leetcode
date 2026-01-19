class Solution {
    public int findGCD(int[] nums) {
       int min = 1001;
       int max = 0;
       for(int i=0;i<nums.length;i++){
        min = Math.min(nums[i],min);
        max = Math.max(nums[i], max);
       }
        // return GCD( nums[nums.length-1] , nums[0]);
        while(min!=0){
            int temp = max%min;
            max = min;
            min = temp;
        }
        return max;
    }
    // // private int GCD(int m , int n){
    //     if(n==0)
    //         return m;
    //     return GCD(n,m%n);
    // }
}