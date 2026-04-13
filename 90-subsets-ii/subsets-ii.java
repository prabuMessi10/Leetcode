class Solution {
    public void subset(int i , int[]nums, List<List<Integer>> res , List<Integer> ds){
      res.add(new ArrayList<>(ds));
      for(int ind = i;ind<nums.length;ind++){
        if(ind !=i && nums[ind] == nums[ind-1]) continue;
        ds.add(nums[ind]);
        subset(ind+1,nums,res,ds);
        ds.remove(ds.size()-1);
      }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        subset(0,nums,res,new ArrayList<>());
        return res;
    }
}