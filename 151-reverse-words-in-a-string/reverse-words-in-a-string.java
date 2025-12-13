class Solution {
    public String reverseWords(String s) {
        String[] result = s.trim().split("\\s+");
        String re = "";
        for(int i=result.length-1;i>=0;i--){
            re+=result[i];
            if(i!=0)
                re+=" ";
        }
        return re;
    }
}