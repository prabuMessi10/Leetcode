class Solution {
    public boolean isBalanced(String num) {
        int diff =0;
        for(int i=0;i<num.length();i++){
            if(i%2==0)
                diff = diff - (num.charAt(i) - '0');
            else
                diff = diff + (num.charAt(i) - '0');
        }
        return (diff==0);
    }
}