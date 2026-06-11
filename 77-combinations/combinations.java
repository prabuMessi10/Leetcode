class Solution {
    void combination(int i , int[] nums , int k , List<List<Integer>>res , List<Integer> ds){
        if(i==nums.length){
            if(ds.size() == k){
                res.add(new ArrayList<>(ds));
            }
            return;
        }
        ds.add(nums[i]);
        combination(i+1,nums,k,res,ds);
        ds.remove(ds.size()-1);
        combination(i+1,nums,k,res,ds);
    }
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            nums[i] = i+1;
        }
        combination(0,nums,k,res,new ArrayList<>());
        return res;
    }
}