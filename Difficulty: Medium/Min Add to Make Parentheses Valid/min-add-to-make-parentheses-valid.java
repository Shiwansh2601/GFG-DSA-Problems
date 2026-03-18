class Solution {
    public int minParentheses(String s) {
        // code here
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                st.push('(');
            }
            else
            {
                if(st.isEmpty()||st.peek()==')')
                st.push(')');
                else
                st.pop();
            }
        }
        
        return st.size();
    }
}
