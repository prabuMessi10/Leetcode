class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> res = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String a = new String(ch);
            res.putIfAbsent(a,new ArrayList<>());
            res.get(a).add(s);   
        }
        return new ArrayList<>(res.values());
    }
}
