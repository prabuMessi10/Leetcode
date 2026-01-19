class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return GCD( nums[nums.length-1] , nums[0]);
    }
    private int GCD(int m , int n){
        if(n==0)
            return m;
        return GCD(n,m%n);
    }
}