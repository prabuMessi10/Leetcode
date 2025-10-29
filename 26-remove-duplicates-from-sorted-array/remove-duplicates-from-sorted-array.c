int removeDuplicates(int* nums, int numsSize) {
     int ind =1,i=0;
        for( i=0;i<numsSize;i++){
            if(nums[i]!=nums[ind-1]){
              
                nums[ind++] = nums[i];
            }
        }
    return ind;
}