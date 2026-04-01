class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> res = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(res.containsKey(a)){
                if(res.get(a) != b) return false;
            }
            else{
                if(res.containsValue(b)) return false;
                res.put(a,b);
            }
        }
        return true;
    }
}