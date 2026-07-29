class Solution {
    public int findComplement(int num) {
        int n=1;
        int sum=0;
        while(num!=0){
            if((num&1)==0){
                sum += n;
            }
            n*=2;
            num = num>>1;
        }
        return sum;
    }
}