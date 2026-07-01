class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ob = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(Character.isLetterOrDigit(a)){
                ob.append(Character.toLowerCase(a));
            }
        }
        int left = 0;
        int right = ob.length()-1;
        while(left<right){
            if(ob.charAt(left) != ob.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}