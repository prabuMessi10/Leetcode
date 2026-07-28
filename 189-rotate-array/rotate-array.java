class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int[] arr = new int[k];
        int j = 0;
        for(int i=n-k;i<n;i++){
            arr[j++] = nums[i];
        }
        for(int i = n-k-1;i>=0;i--){
            nums[i+k] = nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i] = arr[i];
        }
    }
}
