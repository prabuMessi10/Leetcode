class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            min = Math.min(min,arr[i] - arr[i-1]);
        }
        List<List<Integer>> set = new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i] - arr[i-1] == min){
                List<Integer> row = new ArrayList<>();
                row.add(arr[i-1]);
                row.add(arr[i]);
                set.add(row);
            }
        }
        return set;
    }
}