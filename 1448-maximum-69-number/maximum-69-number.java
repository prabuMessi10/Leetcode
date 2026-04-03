class Solution {
    public int maximum69Number (int num) {
        String a = num+"";
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<a.length();i++){
            String res ="";
            for(int j=0;j<a.length();j++){
                if(j==i){
                    res += (a.charAt(j) =='6') ? '9' : '6';
                }
                else{
                    res+=a.charAt(j);
                }
            }
                System.out.println(res);
                ans.add(Integer.parseInt(res));
        }
        int max = num;
        for(int n : ans){
            if(max < n) max = n;
        }
        return max;
    }
}