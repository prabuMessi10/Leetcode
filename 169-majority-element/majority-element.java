class Solution {
    public int majorityElement(int[] nums) {
        // Boyer moore voting algorithm
        int m = 0;
        int a =0;
        for(int i=0;i<nums.length;i++){
            if(a==0)
                m = nums[i];
            if(m==nums[i])
                a++;
            else
                a--;
        }
        return m;
    }
}