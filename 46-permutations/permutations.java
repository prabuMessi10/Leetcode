class Solution {
    public void permutation(int[]nums, boolean[]check,List<List<Integer>>res,List<Integer> ds){
        if(ds.size()==nums.length){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int ind=0;ind<nums.length;ind++){
            if(check[ind]==false){
                check[ind] = true;
                ds.add(nums[ind]);
                permutation(nums,check,res,ds);
                check[ind]=false;
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] check = new boolean[nums.length];
        permutation(nums,check,res,new ArrayList<>());
        return res;
    }
}