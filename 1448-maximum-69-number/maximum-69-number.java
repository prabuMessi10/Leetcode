class Solution {
    public int maximum69Number (int num) {
        String a = num+"";
        int summa =-1;
        String res ="";
        for(int i=0;i<a.length();i++){
            if(summa ==-1 && a.charAt(i) == '6'){
            res+='9';
            summa++;
            }
            else
                res+=a.charAt(i);
        }
        return Integer.parseInt(res);
    }
}