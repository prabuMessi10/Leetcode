class Solution {
    boolean self(int n)
    {
        int real = n;
        while(n>0){
           int temp = n%10;
           if(temp ==0|| real%temp != 0) return false;
           n/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(self(i))
                res.add(i);
        }
        return res;
    }
}