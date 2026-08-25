class Solution {
    public int missingMultiple(int[] nums, int k) {
        int max = 0;

        for(int i=0;i<nums.length;i++){

            if(max < nums[i])
                max = nums[i];
        }
        boolean[] feq = new boolean[max+1];
        for(int i=0;i<nums.length;i++)
            feq[nums[i]] = true;
        int j = k;
        while(j <= max){
            if(feq[j] == false)
                return j;
            j = j+k;
        }
        return j;
    }
}
