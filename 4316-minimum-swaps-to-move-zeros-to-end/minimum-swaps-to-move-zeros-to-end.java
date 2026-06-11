class Solution {
    public int minimumSwaps(int[] nums) {
        int i=nums.length-1;
        int count =0;
        while(i>=0 && nums[i] == 0){
            i--;
        }
        for(int j=0;j<nums.length && i>=0;j++){
            if(j<i && nums[j] == 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i--;
                count++;
            }
            while(i>=0 && nums[i] == 0){
            i--;
        }
        }
        return count;
    }
}
