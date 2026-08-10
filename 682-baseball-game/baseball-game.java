class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> op = new Stack<>();
        int sum =0;
        for(String o : operations){
            if(o.equals("D")){
                int d = op.peek()*2;
                op.push(d);
                sum+=(d);
            }
            else if(o.equals("C")){
                sum-=op.pop();
            }
            else if(o.equals("+")){
                int top = op.pop();
                int newScore = top + op.peek();
                op.push(top);
                op.push(newScore);
                sum += newScore;
            }
            else{
                int add = Integer.parseInt(o);
                op.push(add);
                sum+=add;
            }
        }
        return sum;
    }
}
