class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer , Integer> set = new HashMap<>();
        for(int n : nums){
            set.put(n, set.getOrDefault(n,0)+1);
        }
        for(int key : set.keySet()){
            if(set.get(key) == 1)
                return key;
        }
        return 0;











        // Arrays.sort(nums);
        // int i;
        // for( i=0;i<nums.length-1;i++){
        //     if(nums[i] == nums[i+1] && nums[i+1] == nums[i+2]){
        //         i+=2;
        //     }
        //     else{
        //         if(nums[i] == nums[i+1])
        //             return nums[i+2];
        //         else
        //         return nums[i];
        //     }
        // }
        // return nums[i];
    }
}