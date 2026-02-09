class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer , Integer> cnt = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            cnt.put(nums[i] , cnt.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int key : cnt.keySet()){
            if(cnt.get(key) > nums.length/3)
                res.add(key);
        }
        return res;
    }
}