class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        int vow =0;
        int cons =0;
        String res = "aeiouAEIOU";
        for(int i=0;i<word.length();i++){
            if(!Character.isLetterOrDigit(word.charAt(i))) return false;
            else if(Character.isDigit(word.charAt(i))) continue;
            else{
                if(res.indexOf(word.charAt(i)) != -1) vow++;
                else cons++;
            }
        }
        System.out.print(vow + "->" + cons);
        return (vow > 0 && cons > 0);
    }
}