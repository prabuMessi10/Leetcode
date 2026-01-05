class Solution {
    public boolean isPowerOfTwo(int n) {
       long value = 1;
       while(value<n){
        value*=2;
       }
       return (value==n);
        // if(n==0)
        //     return false;
        // while(n!=1 && n!=0){
        //     if(n%2 !=0)
        //         return false;
        //     n/=2;
        // }
        // return true;
       
    }
}