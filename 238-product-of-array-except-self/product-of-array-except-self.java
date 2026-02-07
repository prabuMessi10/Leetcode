class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int mul = 1;
        // boolean zero = false;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i] == 0)
        //     {
        //         zero = true;
        //         continue;
        //     }
        //     else
        //         mul *=nums[i];
        // }
        // int[] result = new int[nums.length];
        // if(zero)
        // {
        //     for(int i=0;i<nums.length;i++)
        //     {
        //         if(nums[i] == 0){
        //             result[i] = mul;
        //         }
        //         else
        //             result[i] = 0;
        //     }
        // }
        // else{
        //     for(int i=0;i<nums.length;i++)
        //     {
        //         result[i] = mul/nums[i];
        //     }
        // }
        // return result;
        int[] first = new int[nums.length];
        int[] second = new int[nums.length];
        int[] result = new int[nums.length];
        int fact = 1;
        for(int i=0;i<nums.length;i++)
        {
            first[i] = fact;
            fact*=nums[i];
        }
        fact = 1;
        for(int i=nums.length-1;i>=0;i--)
        {
            second[i] = fact;
            fact*=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            result[i] = first[i] * second[i];
        }
        return result;
    }
}