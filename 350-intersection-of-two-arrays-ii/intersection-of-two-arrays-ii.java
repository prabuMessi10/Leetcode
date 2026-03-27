class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] visit1 = new int[1001];
        int[] visit2 = new int[1001];
        for(int i=0;i<nums1.length;i++)
            visit1[nums1[i]]++;
        for(int i=0;i<nums2.length;i++)
            visit2[nums2[i]]++;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(visit1[nums1[i]] >0 && visit2[nums1[i]] >0){
                ans.add(nums1[i]);
                visit1[nums1[i]]--;
                visit2[nums1[i]]--;
            }
        }
        int[] res = new int[ans.size()];
        int i=0;
        for(int n:ans)
            res[i++] = n;
        return res;
       
    }
}