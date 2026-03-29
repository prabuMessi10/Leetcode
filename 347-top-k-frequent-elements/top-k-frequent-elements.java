class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> res = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            res.put(nums[i],res.getOrDefault(nums[i],0)+1);
        }
        int[] ans = new int[k];
        int h =0;
        for(int i=0;i<k;i++){
            int max = 0;
            int value = 0;
            for(int n : res.keySet()){
                if(res.get(n) > max){
                    max = res.get(n);
                    value = n;
                }
            }
            ans[h++] = value;
            res.remove(value);
        }
        return ans;
    }
}