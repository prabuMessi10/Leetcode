class Solution {
    public int findKthPositive(int[] arr, int k) {
        int j=0;
        for(int i=1;i<=10000;i++){
            if(arr.length >j && arr[j] == i){
                j++;
            }
            else
                k--;
            if(k==0)
                return i;
        }
        return -1;
    }
}