#include<algorithm>
class Solution {
public:
    vector<int> numberGame(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        for(int i=0;i<nums.size();i+=2){
            int temp = nums[i+1];
            nums[i+1] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
};