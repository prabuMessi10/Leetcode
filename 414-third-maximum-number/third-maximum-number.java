class Solution {
    public int thirdMax(int[] nums) {
      Arrays.sort(nums);
      int count =0;
      HashSet<Integer> set = new HashSet<>();
        for(int i= nums.length-1;i>=0;i--){
            if(set.add(nums[i])){
                count++;
            }
            if(count==3){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}