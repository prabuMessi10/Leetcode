class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)
            return 1;
        int i=0;
        int res = 0;
        while(n>0){
            int a = n&1;
            if(a == 0)
                res = res + (int)Math.pow(2,i);
            i++;
            n = n>>1;
        }
        return res;
    }
}