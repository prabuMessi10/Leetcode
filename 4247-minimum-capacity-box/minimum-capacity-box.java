class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int index = -1;
        int diff =101;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i] == itemSize) return i;
            if(capacity[i] > itemSize){
                if(diff > capacity[i] - itemSize){
                    diff = capacity[i] - itemSize;
                    index = i;
                }
            }
        }
        return index;
    }
}