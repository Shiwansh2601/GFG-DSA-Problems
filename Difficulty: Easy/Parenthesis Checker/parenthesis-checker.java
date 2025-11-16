class Solution {
    public boolean isBalanced(String s) {
        // code here
         Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='('||ch=='{'||ch=='[')
            {
                st.push(ch);
            }
            else
            {
                if(st.isEmpty())
                return false;
                 char top=st.peek();
                if((ch==')' && top=='(')||(ch=='}' && top=='{')||(ch==']' && top=='['))
                {
                      st.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
