class Solution {
    public void solution(int i, int[] candidates,int target,List<List<Integer>> ans , List<Integer> ds){
        if(i==candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(target >= candidates[i]){
        ds.add(candidates[i]);
        solution(i+1,candidates,target-candidates[i],ans,ds);
        ds.remove(ds.size()-1);
        }
        while(i < candidates.length-1 && candidates[i] == candidates[i+1]) i++;
        solution(i+1,candidates,target,ans,ds);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        solution(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}
