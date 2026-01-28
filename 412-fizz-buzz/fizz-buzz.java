class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> set = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
                set.add("FizzBuzz");
            else if(i%3==0)
                set.add("Fizz");
            else if(i%5==0)
                set.add("Buzz");
            else
                set.add(i+"");
        }
        return set;
    }
}