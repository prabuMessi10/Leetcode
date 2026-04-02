class Solution {
    public int minSteps(String s, String t) {
        int count =0;
        int feq[] = new int[27];
        for(int i=0;i<t.length();i++){
            feq[t.charAt(i) - 'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(feq[s.charAt(i)-'a'] !=0) feq[s.charAt(i)-'a']--;
        }
        for(int i=0;i<27;i++){
            count+=feq[i];
        }
        return count;
    }
}