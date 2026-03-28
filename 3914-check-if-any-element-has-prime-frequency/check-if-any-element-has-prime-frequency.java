class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int[] feq = new int[101];
        for(int i=0;i<nums.length;i++){
            feq[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            int n = feq[nums[i]];
            if(n<=1) continue;
            if(n==2 || n==3 || n==5 || n==7) return true;
            if(n%2!=0 && n%3!=0 && n%5!=0 && n%7!=0)
                return true;
        }
        return false;
    }
}