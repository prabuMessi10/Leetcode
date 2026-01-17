class Solution {
    public List<Integer> intersection(int[][] arr) {
        List<Integer> result = new ArrayList<>();
       Map<Integer , Integer> set = new HashMap<>();
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            set.put(arr[i][j],set.getOrDefault(arr[i][j],0)+1);
        }
       }
       for(int n : set.keySet()){
            if(set.get(n) == arr.length)
                result.add(n);
       }
       Collections.sort(result);
       return result;
    }
}