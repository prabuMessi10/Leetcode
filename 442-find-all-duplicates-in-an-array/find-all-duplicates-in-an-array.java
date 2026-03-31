class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] feq = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            feq[nums[i]]++;
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=1;i<nums.length+1;i++){
            if(feq[i] == 2){
                res.add(i);
            }
        }
        return res;
    }
}