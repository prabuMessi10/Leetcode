class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i =0;
        boolean peek = false;
        int result = -1;
        for(;i<arr.length-1;i++){
            if(peek && arr[i] < arr[i+1]){
               return -1; 
            }
            if(arr[i] > arr[i+1] && !peek){
                peek=true;
                result = i;
            }
        }
        return result;
    }
}