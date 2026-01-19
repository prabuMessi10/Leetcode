class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
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