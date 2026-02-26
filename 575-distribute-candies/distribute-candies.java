class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> res = new HashSet<>();
        for(int i=0;i<candyType.length;i++)
        {
            res.add(candyType[i]);
        }
        int count = res.size();
        if(count <= candyType.length/2)
            return count;
        return candyType.length/2;

    }
}