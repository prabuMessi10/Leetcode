class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // int i =0;
        // boolean peek = false;
        // int result = -1;
        // for(;i<arr.length-1;i++){
        //     if(peek && arr[i] < arr[i+1]){
        //        return -1; 
        //     }
        //     if(arr[i] > arr[i+1] && !peek){
        //         peek=true;
        //         result = i;
        //     }
        // }
        // return result;
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}