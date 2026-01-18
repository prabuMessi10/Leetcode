class Solution {
    public boolean areOccurrencesEqual(String s) {
    //     Map<Character, Integer> set = new HashMap<>();
    //     for(char n : s.toCharArray()){
    //         set.put(n,set.getOrDefault(n,0)+1);
    //     }
    //     int digit = set.get(s.charAt(0));
    //     for(char n : set.keySet()){
    //         if(digit != set.get(n))
    //             return false;
    //     }
    //     return true;
    // }
    int[] count = new int[26];
    for(int i=0;i<s.length();i++){
        count[s.charAt(i) - 'a']++;
    }
    int digit = count[s.charAt(0) - 'a'];
    for(int i=1;i<s.length();i++){
        if(digit != count[s.charAt(i) - 'a'])
            return false;
    }
    return true;
    }
}