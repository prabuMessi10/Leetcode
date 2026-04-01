class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] parts = s.split(" ");
        if(parts.length != pattern.length()) return false;
        HashMap<Character , String> res = new HashMap<>();
        for(int i=0;i<parts.length;i++){
            char pat = pattern.charAt(i);
            String part = parts[i].trim();

            if(res.containsKey(pat)){
                if(!res.get(pat).equals(part))  return false;
            }
            else{
                if(res.containsValue(part)) return false;
                res.put(pat,part);
            }
        }
        return true; 
    }
}