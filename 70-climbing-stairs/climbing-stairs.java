class Solution {
    public int count(int n , int[] dp){
        if(n==0|| n==1) return 1;
        if(dp[n]!=0) return dp[n];
        return count(n-1,dp)+count(n-2,dp);
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] =1;
        for(int i=2;i<=n;i++)
            dp[i] = dp[i-1]+dp[i-2];
        return dp[n];
    }
}