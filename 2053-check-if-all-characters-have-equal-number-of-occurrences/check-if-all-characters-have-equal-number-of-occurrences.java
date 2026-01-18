class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> set = new HashMap<>();
        for(char n : s.toCharArray()){
            set.put(n,set.getOrDefault(n,0)+1);
        }
        int digit = set.get(s.charAt(0));
        for(char n : set.keySet()){
            if(digit != set.get(n))
                return false;
        }
        return true;
    }
}