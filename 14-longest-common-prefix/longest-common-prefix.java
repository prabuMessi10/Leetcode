class Solution {
    public String longestCommonPrefix(String[] arr) {
        if(arr.length <= 0)
            return "";
        String result ="";
        for(int i=0;i<min(arr).length();i++){
            int strike = 0;
            char a = arr[0].charAt(i);
            for(String s : arr){
                if(a == s.charAt(i))
                    strike++;
                else
                    break;
            }
            if(strike == arr.length)
                result+=arr[0].charAt(i);
            else
                break;
        }
        return result;
    }
    private String min(String[] arr){
        String result = arr[0];
        for(String n : arr){
            if(result.length() > n.length())
                result = n;
        }
        return result;
    }
}







        // HashSet<Character> ob = new HashSet<>();
        // String result ="";
        // int count=0;
        // int j=0;
        // for(int i=0;i<strs[0].length();i++){
        //     count=0;
        //     char ch = strs[0].charAt(i);
        //     ob.add(ch);
        //     for(j=0;j<strs.length;j++){
                
        //         if(!ob.add(strs[j].charAt(i))){
        //          count++;   
        //         }
        //     }
        //    if(count == strs.length){
        //         result += ch;
        //    }
        //    else{
        //     return result;
        //    }
        // }
        // return result;
        // String result ="";
        // int wlength = strs[0].length();
        // int Alength = strs.length;
        // for(int i=0;i<wlength;i++){
        //     int strike = 0;
        //     for(int j=0;j<Alength-1;j++){
        //         if(strs[j].charAt(i) == strs[j+1].charAt(i)){
        //             strike++;
        //         }
        //     }
        //     if(strike==Alength-1){
        //         result+=strs[0].charAt(i);
        //     }
        //     else{
        //         return result;
        //     }
        // }
        // return result;
        // String result = "";
        // boolean strike = true;
        // int i;
        // int j;
        // for(i=0;i<arr[0].length();i++){
        //     for(j=0;j<arr.length-1;j++){
        //         if(arr[j].charAt(i) != arr[j+1].charAt(i))
        //             strike = false;
        //     }
        //     if(strike == true)
        //         result+=arr[0].charAt(i);
        //     else
        //         return result;
        //     strike = true;
        // }
        // return result;