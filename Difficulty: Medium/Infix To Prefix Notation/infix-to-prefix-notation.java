class Solution {
    public String infixToPrefix(String s) {
        // code here
        
        
        
        
        String ans="";
        Stack<Character>st=new Stack<>();
        int i=s.length()-1;
        
        while(i>=0)
        {
            char ch=s.charAt(i);
            
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')|| (ch>='0' && ch<='9'))
            {
               ans=ans+ch;
                
            }
            else if(ch==')')
            {
                st.push(ch);
            }
            else if(ch=='(')
            {
                while(!st.isEmpty() && st.peek()!=')')
                {
                    ans+=st.pop();
                }
                
                st.pop();
            }
            else 
            {
                while(!st.isEmpty() && ((priority(st.peek())>priority(ch)) || ( priority(st.peek())==priority(ch) && ch=='^')))
                {
                    ans=ans+st.pop();
                }
                
                st.push(ch);
            }
            
            i--;
            
        }
        
        while(!st.isEmpty())
        ans=ans+st.pop();
        
        
        StringBuilder sb=new StringBuilder(ans);
        
        return sb.reverse().toString();
    }
    
    
    public static int priority(char ch)
    {
        if(ch=='+' || ch=='-')
        return 1;
        else if(ch=='*' || ch=='/')
        return 2;
        else if(ch=='^')
        return 3;
        else 
        return -1;
        
    }
}