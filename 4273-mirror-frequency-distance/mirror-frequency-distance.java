class Solution {
    public int mirrorFrequency(String s) {
        int[] alpha = new int[26];
        int[] digit = new int[10];
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(Character.isDigit(a)){
                digit[a-'0']++;
            }
            else{
                alpha[a-'a']++;
            }
        }
        int left = 0;
        int right = 25;
        int cnt = 0;
        while(left<right){
            cnt+=Math.abs(alpha[left] - alpha[right]);
            left++;
            right--;
        }
        left = 0;
        right = 9;
        while(left<right){
            cnt+=Math.abs(digit[left] - digit[right]);
            left++;
            right--;
        }
        return cnt;
    }
}