class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count =0;
        HashMap<Integer , Integer> set = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(set.containsKey(nums[i])){
                count+=set.get(nums[i]);
            }
            set.put(nums[i] , set.getOrDefault(nums[i],0)+1);
        }
        return count;
    }
}