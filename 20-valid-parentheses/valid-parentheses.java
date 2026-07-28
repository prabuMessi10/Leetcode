class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0) return false;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(a == '(' || a == '[' || a == '{')
                st.push(a);
            else{
                if(st.isEmpty())
                    return false;
                char b = st.pop();
                if(a == ')'){
                    if(b != '(')
                        return false;
                }
                else if(a == ']'){
                    if(b != '[')
                        return false;
                }
                else{
                    if(b != '{')
                        return false;
                }
            }
        }
        if(st.isEmpty())
            return true;
        return false;

    }
}
