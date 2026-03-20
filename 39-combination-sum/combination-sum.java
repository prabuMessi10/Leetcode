class Solution {
    public void combination(int i , int target , int[] candidates,List<List<Integer>> set , List<Integer> ds ){
        if(i == candidates.length){
            if(target == 0){
                set.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[i] <= target){
            ds.add(candidates[i]);
            combination(i,target-candidates[i],candidates,set,ds);
            ds.remove(ds.size()-1);
        }
        combination(i+1,target,candidates,set,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> set = new ArrayList<>();
        combination(0,target,candidates,set,new ArrayList<Integer>());
        return set;
    }
}