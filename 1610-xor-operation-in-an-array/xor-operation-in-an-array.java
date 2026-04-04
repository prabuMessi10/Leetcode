class Solution {
    public int xorOperation(int n, int start) {
        int sum = 0;
        for(int i=0;i<n;i++,start+=2)
            sum^=start;
        return sum;
    }
}