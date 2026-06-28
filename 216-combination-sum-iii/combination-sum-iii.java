class Solution {
    public void solution(int i , int size,int target,List<List<Integer>> ans,List<Integer> ds,int sum){
        // if(i == size+1){
        //     if(target==0 && size==ds.size())
        //         ans.add(new ArrayList<>(ds));
        //     return;
        // }
        // ds.add(i);
        // solution(i+1,size,target-i,ans,ds);
        // ds.remove(ds.size()-1);
        // solution(i+1,size,target,ans,ds);


        
        if(i==10){
            if(sum == target && ds.size() == size) ans.add(new ArrayList<>(ds));
            return;
        }
            ds.add(i);
            solution(i+1,size,target,ans,ds,sum+i);
            ds.remove(ds.size()-1);
            solution(i+1,size,target,ans,ds,sum);
        
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        solution(1,k,n,ans,new ArrayList<>(),0);
        return ans;
    }
}
