class Solution {
    public boolean checkRecord(String s) {
        int a =0;
        int strike = 0;
        for(char n : s.toCharArray()){
            if(n == 'A'){
                a++;
                strike=0;
            }
            else if(n=='L'){
                strike++;
            }
            else{
                strike=0;
            }
           if(strike==3){
                return false;
            }
        }
        if(a >=2 || strike==3)
            return false;
        return true;
    }
}