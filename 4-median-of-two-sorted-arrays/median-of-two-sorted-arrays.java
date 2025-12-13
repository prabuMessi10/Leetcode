class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i =0 , j = 0, k = 0;
        int nums3[] = new int[(nums1.length) + (nums2.length)];
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] >= nums2[j])
                nums3[k++] = nums2[j++];
            else
                nums3[k++] = nums1[i++];
        }
        while(i < nums1.length)
            nums3[k++] = nums1[i++];
        while(j < nums2.length)
            nums3[k++] = nums2[j++];
        int n = nums3.length;
        if(n%2==0){
            float result = nums3[n/2]+nums3[(n/2)-1];
            return result/2;
        }
        return (double)nums3[n/2];
    }
}