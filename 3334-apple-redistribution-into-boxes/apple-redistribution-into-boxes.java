class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum =0;
        for(int ap : apple ){
            sum+=ap;
        }
        Arrays.sort(capacity);
        int count =0;
        for(int i=capacity.length-1;i>=0;i--){
           count++;
           sum-=capacity[i];
           if(sum<=0)
                break;
        }
        return count;
    }
}