class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> ferg = new HashMap<>();
        for(int n : nums){
            ferg.put(n , ferg.getOrDefault(n,0)+1);
        }
        for(Integer key : ferg.keySet()){
            if(ferg.get(key) > nums.length/2)
                return key;
        }
        return 0;
    }
}