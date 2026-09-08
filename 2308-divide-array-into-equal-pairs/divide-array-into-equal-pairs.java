class Solution {
    public boolean divideArray(int[] nums) {
        int max =0;
        for(int n : nums){
            if(max < n)
                max = n;
        }
        int[] feq = new int[max+1];
        for(int n : nums){
            feq[n]++;
        }
        for(int n : feq){
            if(n%2 != 0)
             return false;
        }
        return true;
    }
}
