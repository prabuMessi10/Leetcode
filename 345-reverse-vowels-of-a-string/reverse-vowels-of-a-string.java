class Solution {
    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length-1;
        String vowel = "aeiouAEIOU";
        while(right>left){
            if(vowel.indexOf(charArray[right]) == -1){
                right--;
            }
            if(vowel.indexOf(charArray[left]) == -1){
                left++;
            }
            if( vowel.indexOf(charArray[left]) != -1 && vowel.indexOf(charArray[right]) != -1 ){
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }
        return new String(charArray);
    }
}