class Solution {
    public int sumOfUnique(int[] nums) {
        int[] cnt = new int[101];
        for(int i=0;i<nums.length;i++)
        {
            cnt[nums[i]]++;
        }
        int sum =0;
        for(int i=0;i<nums.length;i++){
            if(cnt[nums[i]] == 1)
                sum+=nums[i];
        }
        return sum;
    }
}