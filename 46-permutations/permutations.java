class Solution {
    public void permutation(int i,int[] nums,List<List<Integer>> res , List<Integer> ds,boolean[] check){
        if(i == nums.length){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int j=0;j<nums.length;j++){
            if(check[j] == false){
                ds.add(nums[j]);
                check[j] = true;
                permutation(i+1,nums,res,ds,check);
                check[j] = false;
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] check = new boolean[nums.length];
        permutation(0,nums,res,new ArrayList<>(),check);
        return res;
    }
}