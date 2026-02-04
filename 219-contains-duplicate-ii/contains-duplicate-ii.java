class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer , Integer> set = new HashMap<>();
        set.put(nums[0],0);
        for(int i=1;i<nums.length;i++)
        {
            if(set.containsKey(nums[i])){
                int key = set.get(nums[i]);
                if(Math.abs(key-i) <= k)
                    return true;
            }
            set.put(nums[i],i);
        }
        return false;
    }
}