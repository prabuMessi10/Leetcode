class Solution {
    public int trap(int[] height) {
        int i=0,j=height.length-1,water=0,leftmax=0,rightmax=0;
        while(i<j){
            if(height[i] <= height[j])
            {
                leftmax = Math.max(leftmax,height[i]);
                water += leftmax-height[i];
                i++;
            }
            else{
                rightmax = Math.max(rightmax,height[j]);
                water+=rightmax-height[j];
                j--;
            }
        }
        return water;
    }
}
