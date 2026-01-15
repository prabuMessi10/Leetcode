class Solution {
    public String reverseWords(String s) {
        // int start = 0;
        // int end = 0;
        // String result = "";
        // for(int i=0;i<s.length();i++){
        //     if((s.charAt(i) == ' ') || (i == s.length() - 1)){
        //         end = i;
        //         if(i==s.length()-1)
        //             result+=' ';
        //         while(end >= start){
        //             result+=s.charAt(end);
        //             end--;
        //         }
        //         start = i+1;
                
        //     }
        // }
        // return result.trim();
        String result ="";
        String[] A = s.split("\\s+");
        for(String S : A){
            StringBuilder set = new StringBuilder(S);
            result += set.reverse()+" ";
        }
        return  result.trim();
}
}