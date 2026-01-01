class Solution {
    public int[] transformArray(int[] nums) {
        int odd=0;
        int even=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
                even++;
            else
                odd++;
        }
        int[] arr = new int[nums.length];
        for(int i=0;i<even;i++)
            arr[i] = 0;
        for(int i =even;i<odd+even;i++){
            arr[i] = 1;
        }
        return arr;
    }
}