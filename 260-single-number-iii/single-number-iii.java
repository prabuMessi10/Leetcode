class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length == 2)
            return nums;
        int[] arr = new int[2];
        HashMap<Integer , Integer> set = new HashMap<>();
        for(int n : nums){
            set.put(n,set.getOrDefault(n,0)+1);
        }
        int i=0;
        for(int n : set.keySet()){
            if(set.get(n) == 1)
                arr[i++] = n;
            if(i==2)
                break;
        }
        return arr;
    }
}