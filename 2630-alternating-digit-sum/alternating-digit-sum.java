class Solution {
    public int alternateDigitSum(int n) {
        String a = n+"";
        int diff =0;
        for(int i=0;i<a.length();i++){
            if(i%2==0)
                diff+= (a.charAt(i) - '0');
            else
                diff-= (a.charAt(i) - '0');
        }
        return diff;
    }
}