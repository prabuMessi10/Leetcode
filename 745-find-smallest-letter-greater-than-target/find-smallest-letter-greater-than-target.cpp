class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        if(target == 'a' && letters[0] !='a')
            return letters[0];
        for(int i=0;i<letters.size();i++){
            if(target < letters[i])
                return letters[i];
        }
        return letters[0];
    }
};