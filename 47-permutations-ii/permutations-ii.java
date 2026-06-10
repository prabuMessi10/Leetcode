class Solution {
    public void permutation(int i , int[] nums, Set<List<Integer>> res , List<Integer> ds,boolean[] check){
        if(i == nums.length){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int j =0;j<nums.length;j++){
            if(check[j] == false){
                ds.add(nums[j]);
                check[j] = true;
                permutation(i+1,nums,res,ds,check);
                check[j] = false;
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> res =new HashSet<>();
        boolean[] check = new boolean[nums.length];
        permutation(0,nums,res,new ArrayList<>(),check);
        List<List<Integer>> real_res = new ArrayList<>(res);
        return real_res;
    }
}